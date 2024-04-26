package com.example.zip_grpc.service;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.example.estate_grpc.proto.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

import com.example.zip_grpc.ZipAgentIdRequest;
import com.example.zip_grpc.ZipAgentIdResponse;
import com.example.zip_grpc.ZipAllRequest;
import com.example.zip_grpc.ZipAllResponse;
import com.example.zip_grpc.ZipDeleteRequest;
import com.example.zip_grpc.ZipDeleteResponse;
import com.example.zip_grpc.ZipEsateIdRequest;
import com.example.zip_grpc.ZipEstateIdResponse;
import com.example.zip_grpc.ZipIdRequest;
import com.example.zip_grpc.ZipIdResponse;
import com.example.zip_grpc.ZipInsertRequest;
import com.example.zip_grpc.ZipInsertResponse;
import com.example.zip_grpc.ZipProtoServiceGrpc;
import com.example.zip_grpc.ZipSearchRequest;
import com.example.zip_grpc.ZipSearchResponse;
import com.example.zip_grpc.ZipShowNoRequest;
import com.example.zip_grpc.ZipShowNoResponse;
import com.example.zip_grpc.ZipShowYesRequest;
import com.example.zip_grpc.ZipShowYesResponse;
import com.example.zip_grpc.ZipUpdateRequest;
import com.example.zip_grpc.ZipUpdateResponse;
import com.example.zip_grpc.dto.EstateDTO;
import com.example.zip_grpc.dto.ZipDTO;
import com.example.zip_grpc.dto.ZipUpdateDTO;
import com.example.zip_grpc.entity.QZip;
import com.example.zip_grpc.entity.Zip;
import com.example.zip_grpc.repository.ZipRepository;
import com.querydsl.core.BooleanBuilder;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.SubQueryExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;

import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@GrpcService
public class GrpcClientServer extends ZipProtoServiceGrpc.ZipProtoServiceImplBase {

	private final ZipRepository zipRepository;

	@Autowired
	private JPAQueryFactory queryFactory;

	@Autowired
	public GrpcClientServer(ZipRepository zipRepository){
		this.zipRepository = zipRepository;
	}

	@Autowired
	private ModelMapper mapper;

	//zipDTO를 com.example.zip_grpc.Zip로 변환
	private com.example.zip_grpc.Zip buildZipFromDTO(ZipDTO zipDTO){
		return com.example.zip_grpc.Zip.newBuilder()
			.setId(zipDTO.getId())
			.setAttachments(zipDTO.getAttachments())
			.setAgentId(zipDTO.getAgentId())
			.setCheckedAt(String.valueOf(zipDTO.getCheckedAt()))
			.setEstateId(zipDTO.getEstateId())
			.setDirection(zipDTO.getDirection())
			.setTotalFloor(zipDTO.getTotalFloor())
			.setBuildingFloor(zipDTO.getBuildingFloor())
			.setBuildingType(zipDTO.getBuildingType())
			.setDeposit(zipDTO.getDeposit())
			.setFee(zipDTO.getFee())
			.setAvailable(String.valueOf(zipDTO.getAvailable()))
			.setHashtag(zipDTO.getHashtag())
			.setM2(zipDTO.getM2())
			.setLocation(zipDTO.getLocation())
			.setShowYes(zipDTO.getShowYes())
			.setNote(zipDTO.getNote())
			.setRoom(zipDTO.getRoom())
			.setToilet(zipDTO.getToilet())
			.setMaintenanceFee(zipDTO.getMaintenanceFee())
			.setPremium(String.valueOf(zipDTO.getPremium()))
			.build();
	}

	//집 정보 하나 id로 조회
	public void getZipInfo(ZipIdRequest request, StreamObserver<ZipIdResponse> responseObserver) {
		String id = request.getId();

		//제공된 id로 zip 정보 찾는 로직
		Optional<Zip> zipEntity = zipRepository.findById(id);
		Zip zip = zipEntity.orElseThrow(() -> new NoSuchElementException("Zip not found with id: " + id));

		ZipDTO zipDTO = mapper.map(zip, ZipDTO.class);

		ZipIdResponse response = ZipIdResponse.newBuilder()
			.setId(id)
			.setAttachments(zipDTO.getAttachments())
			.setAgentId(zipDTO.getAgentId())
			.setCheckedAt(String.valueOf(zipDTO.getCheckedAt()))
			.setEstateId(zipDTO.getEstateId())
			.setDirection(zipDTO.getDirection())
			.setTotalFloor(zipDTO.getTotalFloor())
			.setBuildingFloor(zipDTO.getBuildingFloor())
			.setBuildingType(zipDTO.getBuildingType())
			.setDeposit(zipDTO.getDeposit())
			.setFee(zipDTO.getFee())
			.setAvailable(String.valueOf(zipDTO.getAvailable()))
			.setHashtag(zipDTO.getHashtag())
			.setM2(zipDTO.getM2())
			.setLocation(zipDTO.getLocation())
			.setShowYes(zipDTO.getShowYes())
			.setNote(zipDTO.getNote())
			.setRoom(zipDTO.getRoom())
			.setToilet(zipDTO.getToilet())
			.setMaintenanceFee(zipDTO.getMaintenanceFee())
			.setPremium(String.valueOf(zipDTO.getPremium()))
			.build();

		//응답
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	//집 모두 조회
	public void getZipAll(ZipAllRequest zipAllRequest, StreamObserver<ZipAllResponse> zipAllResponseStreamObserver){

		List<Zip> zipEntitys = zipRepository.findAll();
		List<ZipDTO> zipDTOs = Arrays.asList(mapper.map(zipEntitys, ZipDTO[].class));

		ZipAllResponse.Builder response = ZipAllResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		zipAllResponseStreamObserver.onNext(response.build());
		zipAllResponseStreamObserver.onCompleted();
	}

	//public인 집만 모두 조회
	public void getZipShowYes(ZipShowYesRequest zipShowYesRequest, StreamObserver<ZipShowYesResponse> zipShowYesResponse){
		List<Zip> zipEntitys = zipRepository.findMinFeeByEstateId("public");
		//List<Zip> zipEntitys = zipRepository.findByShowYes("public");
		List<ZipDTO> zipDTOs = Arrays.asList(mapper.map(zipEntitys, ZipDTO[].class));

		ZipShowYesResponse.Builder response = ZipShowYesResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		zipShowYesResponse.onNext(response.build());
		zipShowYesResponse.onCompleted();
	}

	//private인 집만 모두 조회
	public void getZipShowNo(ZipShowNoRequest request, StreamObserver<ZipShowNoResponse> zipResponse){
		List<Zip> zipEntitys = zipRepository.findMinFeeByEstateId("private");
		//List<Zip> zipEntitys = zipRepository.findByShowYes("private");
		List<ZipDTO> zipDTOs = Arrays.asList(mapper.map(zipEntitys, ZipDTO[].class));

		ZipShowNoResponse.Builder response = ZipShowNoResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		zipResponse.onNext(response.build());
		zipResponse.onCompleted();
	}

	//중개사 id로 매물 조회
	public void getZipByAgent(ZipAgentIdRequest request, StreamObserver<ZipAgentIdResponse> zipResponse){
		String agentID = request.getAgentId();
		List<Zip> zipEntitys = zipRepository.findByAgentId(agentID);
		List<ZipDTO> zipDTOs = Arrays.asList(mapper.map(zipEntitys, ZipDTO[].class));

		ZipAgentIdResponse.Builder response = ZipAgentIdResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		zipResponse.onNext(response.build());
		zipResponse.onCompleted();
	}

	//estateid로 zip 조회
	public void getZipByEstate(ZipEsateIdRequest request, StreamObserver<ZipEstateIdResponse> zipResponse){
		String estateID = request.getEstateId();
		List<Zip> zipEntitys = zipRepository.findByEstateId(estateID);
		List<ZipDTO> zipDTOs = Arrays.asList(mapper.map(zipEntitys, ZipDTO[].class));

		ZipEstateIdResponse.Builder response = ZipEstateIdResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		zipResponse.onNext(response.build());
		zipResponse.onCompleted();

	}

	@GrpcClient("estate-server")
	private EstateProtoServiceGrpc.EstateProtoServiceBlockingStub estateStub;

	public EstateDTO findEstateInfo(final String id){
		try {
			EstateInfoResponse response = this.estateStub.findEstateInfo(EstateIdRequest.newBuilder().setEstateId(id).build());
			EstateDTO estateDTO = new EstateDTO();
			estateDTO.setBuildingFloor(response.getBuildingFloor());
			estateDTO.setEstateType(response.getEstateType());
			estateDTO.setDirection(response.getDirection());
			estateDTO.setHashtag(response.getHashtag());
			estateDTO.setLocation(response.getLocation());
			estateDTO.setM2(response.getM2());
			estateDTO.setRoom(response.getRoom());
			estateDTO.setToilet(response.getToilet());
			estateDTO.setTotalFloor(response.getTotalFloor());
			estateDTO.setSuccess(true);

			log.info("가져온 estate 정보 : {}", estateDTO.toString());

			return estateDTO;
		}catch (StatusRuntimeException e){
			EstateDTO estateDTO = new EstateDTO();
			estateDTO.setSuccess(false);
			return estateDTO;
		}
	}

	//집 정보 insert
	@Transactional
	public void saveZip(ZipInsertRequest request, StreamObserver<ZipInsertResponse> responseStreamObserver){

		ZipDTO zipDTO = new ZipDTO();

		UUID uuid = UUID.randomUUID();
		zipDTO.setId(uuid.toString());

		zipDTO.setAttachments(request.getAttachments());
		zipDTO.setAgentId(request.getAgentId());
		zipDTO.setCheckedAt(LocalDateTime.parse(request.getCheckedAt()));
		zipDTO.setEstateId(request.getEstateId());
		zipDTO.setDirection(request.getDirection());
		zipDTO.setTotalFloor(request.getTotalFloor());
		zipDTO.setBuildingFloor(request.getBuildingFloor());
		zipDTO.setBuildingType(request.getBuildingType());
		zipDTO.setDeposit(request.getDeposit());
		zipDTO.setFee(request.getFee());
		zipDTO.setAvailable(LocalDateTime.parse(request.getAvailable()));
		zipDTO.setHashtag(request.getHashtag());
		zipDTO.setM2(request.getM2());
		zipDTO.setLocation(request.getLocation());
		zipDTO.setShowYes(request.getShowYes());
		zipDTO.setNote(request.getNote());
		zipDTO.setRoom(request.getRoom());
		zipDTO.setToilet(request.getToilet());
		zipDTO.setMaintenanceFee(request.getMaintenanceFee());
		zipDTO.setPremium(LocalDateTime.parse(request.getPremium()));

		// 매물에 대한 부동산 정보 가져오기
		EstateDTO estateDTO = findEstateInfo(zipDTO.getEstateId());

		// 가져온 부동산 정보가 있는 경우에는 설정
		if (estateDTO.isSuccess()) {
			log.info("가져온 부동산 정보가 있음: {}",estateDTO.toString());
			//estate update
			estateStub.updateEstate(EstateUpdateRequest
					.newBuilder()
					.setEstateId(zipDTO.getEstateId())
					.setLocation(zipDTO.getLocation())
					.setEstateType(zipDTO.getBuildingType())
					.setDirection(zipDTO.getDirection())
					.setTotalFloor(zipDTO.getTotalFloor())
					.setBuildingFloor(zipDTO.getBuildingFloor())
					.setRoom(zipDTO.getRoom())
					.setToilet(zipDTO.getToilet())
					.setHashtag(zipDTO.getHashtag())
					.setM2(zipDTO.getM2())
					.build());
		} else {
			// 새로운 부동산 정보 생성
			log.info("새로운 부동산 정보 생성");
			//estate save
			estateStub.saveEstate(EstateSaveRequest
					.newBuilder()
					.setEstateId(zipDTO.getEstateId())
					.setLocation(zipDTO.getLocation())
					.setEstateType(zipDTO.getBuildingType())
					.setDirection(zipDTO.getDirection())
					.setTotalFloor(zipDTO.getTotalFloor())
					.setBuildingFloor(zipDTO.getBuildingFloor())
					.setRoom(zipDTO.getRoom())
					.setToilet(zipDTO.getToilet())
					.setHashtag(zipDTO.getHashtag())
					.setM2(zipDTO.getM2())
					.build());
		}

		Zip zipEntity = mapper.map(zipDTO, Zip.class);

		log.info("zip request {}", request.toString());
		log.info("zip entity {}", zipEntity.toString());

		zipEntity = zipRepository.save(zipEntity);

		ZipInsertResponse response = ZipInsertResponse.newBuilder()
			.setId(zipDTO.getId())
			.setAttachments(zipDTO.getAttachments())
			.setAgentId(zipDTO.getAgentId())
			.setCheckedAt(String.valueOf(zipDTO.getCheckedAt()))
			.setEstateId(zipDTO.getEstateId())
			.setDirection(zipDTO.getDirection())
			.setTotalFloor(zipDTO.getTotalFloor())
			.setBuildingFloor(zipDTO.getBuildingFloor())
			.setBuildingType(zipDTO.getBuildingType())
			.setDeposit(zipDTO.getDeposit())
			.setFee(zipDTO.getFee())
			.setAvailable(String.valueOf(zipDTO.getAvailable()))
			.setHashtag(zipDTO.getHashtag())
			.setM2(zipDTO.getM2())
			.setLocation(zipDTO.getLocation())
			.setShowYes(zipDTO.getShowYes())
			.setNote(zipDTO.getNote())
			.setRoom(zipDTO.getRoom())
			.setToilet(zipDTO.getToilet())
			.setMaintenanceFee(zipDTO.getMaintenanceFee())
			.setPremium(String.valueOf(zipDTO.getPremium()))
			.build();

		//응답
		responseStreamObserver.onNext(response);
		responseStreamObserver.onCompleted();
	}

	//집 정보 update
	@Transactional
	public void updateZip(ZipUpdateRequest request, StreamObserver<ZipUpdateResponse> responseStreamObserver){
		ZipUpdateDTO zipUpdateDTO = new ZipUpdateDTO();
		zipUpdateDTO.setId(request.getId());
		zipUpdateDTO.setAttachments(request.getAttachments());
		zipUpdateDTO.setAgentId(request.getAgentId());
		zipUpdateDTO.setCheckedAt(LocalDateTime.parse(request.getCheckedAt()));
		zipUpdateDTO.setEstateId(request.getEstateId());
		zipUpdateDTO.setDirection(request.getDirection());
		zipUpdateDTO.setTotalFloor(request.getTotalFloor());
		zipUpdateDTO.setBuildingFloor(request.getBuildingFloor());
		zipUpdateDTO.setBuildingType(request.getBuildingType());
		zipUpdateDTO.setDeposit(request.getDeposit());
		zipUpdateDTO.setFee(request.getFee());
		zipUpdateDTO.setAvailable(LocalDateTime.parse(request.getAvailable()));
		zipUpdateDTO.setHashtag(request.getHashtag());
		zipUpdateDTO.setM2(request.getM2());
		zipUpdateDTO.setLocation(request.getLocation());
		zipUpdateDTO.setShowYes(request.getShowYes());
		zipUpdateDTO.setNote(request.getNote());
		zipUpdateDTO.setRoom(request.getRoom());
		zipUpdateDTO.setToilet(request.getToilet());
		zipUpdateDTO.setMaintenanceFee(request.getMaintenanceFee());
		zipUpdateDTO.setPremium(LocalDateTime.parse(request.getPremium()));

		Zip zip = zipRepository.findById(zipUpdateDTO.getId())
			.orElseThrow(() -> new EntityNotFoundException(zipUpdateDTO.getId() + " 이러한 id의 zip이 없습니다."));

		//만약 DTO와 엔티티가 다르다면 업데이트를 수행
		if (!isSame(zip, zipUpdateDTO)) {
			zip.setAttachments(zipUpdateDTO.getAttachments());
			zip.setAvailable(zipUpdateDTO.getAvailable());
			zip.setM2(zipUpdateDTO.getM2());
			zip.setDeposit(zipUpdateDTO.getDeposit());
			zip.setDirection(zipUpdateDTO.getDirection());
			zip.setBuildingFloor(zipUpdateDTO.getBuildingFloor());
			zip.setTotalFloor(zipUpdateDTO.getTotalFloor());
			zip.setBuildingType(zipUpdateDTO.getBuildingType());
			zip.setHashtag(zipUpdateDTO.getHashtag());
			zip.setFee(zipUpdateDTO.getFee());
			zip.setCheckedAt(zipUpdateDTO.getCheckedAt());
			zip.setAgentId(zipUpdateDTO.getAgentId());
			zip.setEstateId(zipUpdateDTO.getEstateId());
			zip.setNote(zipUpdateDTO.getNote());
			zip.setShowYes(zipUpdateDTO.getShowYes());
			zip.setRoom(zipUpdateDTO.getRoom());
			zip.setToilet(zipUpdateDTO.getToilet());
			zip.setMaintenanceFee(zipUpdateDTO.getMaintenanceFee());
			zip.setPremium(zipUpdateDTO.getPremium());
		}

		ZipUpdateResponse response = ZipUpdateResponse.newBuilder()
			.setId(zip.getId())
			.setAttachments(zip.getAttachments())
			.setAgentId(zip.getAgentId())
			.setCheckedAt(String.valueOf(zip.getCheckedAt()))
			.setEstateId(zip.getEstateId())
			.setDirection(zip.getDirection())
			.setTotalFloor(zip.getTotalFloor())
			.setBuildingFloor(zip.getBuildingFloor())
			.setBuildingType(zip.getBuildingType())
			.setDeposit(zip.getDeposit())
			.setFee(zip.getFee())
			.setAvailable(String.valueOf(zip.getAvailable()))
			.setHashtag(zip.getHashtag())
			.setM2(zip.getM2())
			.setLocation(zip.getLocation())
			.setShowYes(zip.getShowYes())
			.setNote(zip.getNote())
			.setRoom(zip.getRoom())
			.setToilet(zip.getToilet())
			.setMaintenanceFee(zip.getMaintenanceFee())
			.setPremium(String.valueOf(zip.getPremium()))
			.build();

		//응답
		responseStreamObserver.onNext(response);
		responseStreamObserver.onCompleted();
	}

	// Zip과 ZipUpdateDTO가 같은지 비교하는 메서드
	public boolean isSame(Zip zip, ZipUpdateDTO zipUpdateDTO) {

		return zip.getAttachments().equals(zipUpdateDTO.getAttachments())
			&& zip.getCheckedAt().equals(zipUpdateDTO.getCheckedAt())
			&& zip.getDirection().equals(zipUpdateDTO.getDirection())
			&& zip.getTotalFloor() == zipUpdateDTO.getTotalFloor()
			&& zip.getBuildingFloor() == zipUpdateDTO.getBuildingFloor()
			&& zip.getBuildingType().equals(zipUpdateDTO.getBuildingType())
			&& zip.getDeposit() == zipUpdateDTO.getDeposit()
			&& zip.getFee() == zipUpdateDTO.getFee()
			&& zip.getAvailable().equals(zipUpdateDTO.getAvailable())
			&& zip.getHashtag().equals(zipUpdateDTO.getHashtag())
			&& Float.compare(zip.getM2(), zipUpdateDTO.getM2()) == 0
			&& zip.getAgentId().equals(zipUpdateDTO.getAgentId())
			&& zip.getEstateId().equals(zipUpdateDTO.getEstateId())
			&& zip.getLocation().equals(zipUpdateDTO.getLocation())
			&& zip.getNote().equals(zipUpdateDTO.getNote())
			&& zip.getShowYes().equals(zipUpdateDTO.getShowYes())
			&& zip.getRoom() == zipUpdateDTO.getRoom()
			&& zip.getToilet() == zipUpdateDTO.getToilet()
			&& zip.getMaintenanceFee() == zipUpdateDTO.getMaintenanceFee()
			&& zip.getPremium() == zipUpdateDTO.getPremium();
	}

	//집 정보 삭제
	@Transactional
	public void deleteZip(ZipDeleteRequest request, StreamObserver<ZipDeleteResponse> responseStreamObserver){
		String id = request.getId();
		boolean isSuccess = false;

		try {
			// 삭제 전에 해당 ID의 Zip 엔티티가 존재하는지 확인
			Optional<Zip> zipOptional = zipRepository.findById(id);
			if (zipOptional.isPresent()) {
				zipRepository.deleteById(id);
				isSuccess = true;
			} else {
				throw new EntityNotFoundException(id + " 이러한 id의 zip이 없습니다.");
			}
		} catch (Exception e) {
			isSuccess = false;
		}

		//결과에 따라 response에 true 또는 false를 담아 반환
		ZipDeleteResponse response = ZipDeleteResponse.newBuilder()
			.setSuccess(isSuccess)
			.build();
		responseStreamObserver.onNext(response);
		responseStreamObserver.onCompleted();
	}

	//집 검색
	public void searchZip(ZipSearchRequest request, StreamObserver<ZipSearchResponse> responseStreamObserver) {
		BooleanBuilder builder = new BooleanBuilder();

		QZip zip = QZip.zip;
		QZip zip2 = new QZip("zip2");

		SubQueryExpression<Tuple> subQuery = JPAExpressions
				.select(zip2.estateId, zip2.fee.min())
				.from(zip2)
				.groupBy(zip2.estateId);

		Predicate inExpression = Expressions.list(
				zip.estateId,
				zip.fee
		).in(subQuery);

		builder.and(inExpression);

		builder.and(zip.showYes.eq("public"));

		if(!request.getLocation().isEmpty()){
			builder.and(zip.location.like("%" + request.getLocation() + "%"));
		}
		if(request.getDeposit().isEmpty()){
			if (request.getDeposit().equals("~500")) {
				builder.and(zip.deposit.lt(500));
			} else if (request.getDeposit().equals("500~1000")) {
				builder.and(zip.deposit.between(500, 1000));
			} else if (request.getDeposit().equals("1000~2000")) {
				builder.and(zip.deposit.between(1000, 2000));
			} else if (request.getDeposit().equals("2000~")) {
				builder.and(zip.deposit.gt(2000));
			}
		}
		if(request.getFee().isEmpty()){
			if (request.getFee().equals("~50")) {
				builder.and(zip.fee.lt(50));
			} else if (request.getFee().equals("50~75")) {
				builder.and(zip.fee.between(50, 75));
			} else if (request.getFee().equals("75~100")) {
				builder.and(zip.fee.between(75, 100));
			} else if (request.getFee().equals("100~")) {
				builder.and(zip.fee.gt(100));
			}
		}
		if(!request.getBuildingType().isEmpty()){
			String[] listBuildingType = request.getBuildingType().split(",");
			builder.and(zip.buildingType.in(listBuildingType));
		}

		log.info("builder: {}", builder.toString());
		List<ZipDTO> zipDTOs = queryFactory
			.select(zip)
			.from(zip)
			.where(builder)
			.fetch()
			.stream()
			.map(this::convertToDTO)
			.collect(Collectors.toList());
		log.info("list dto: {}", zipDTOs);

		ZipSearchResponse.Builder response = ZipSearchResponse.newBuilder();

		for (ZipDTO zipDTO : zipDTOs) {
			com.example.zip_grpc.Zip zippro = buildZipFromDTO(zipDTO);
			response.addZips(zippro);
		}

		//응답
		responseStreamObserver.onNext(response.build());
		responseStreamObserver.onCompleted();
	}

	//entity를 dto로 변환
	private ZipDTO convertToDTO(Zip zip) {
		ZipDTO zipDTO = new ZipDTO();
		zipDTO.setId(zip.getId());
		zipDTO.setAttachments(zip.getAttachments());
		zipDTO.setAgentId(zip.getAgentId());
		zipDTO.setCheckedAt(zip.getCheckedAt());
		zipDTO.setEstateId(zip.getEstateId());
		zipDTO.setDirection(zip.getDirection());
		zipDTO.setTotalFloor(zip.getTotalFloor());
		zipDTO.setBuildingFloor(zip.getBuildingFloor());
		zipDTO.setBuildingType(zip.getBuildingType());
		zipDTO.setDeposit(zip.getDeposit());
		zipDTO.setFee(zip.getFee());
		zipDTO.setAvailable(zip.getAvailable());
		zipDTO.setHashtag(zip.getHashtag());
		zipDTO.setM2(zip.getM2());
		zipDTO.setLocation(zip.getLocation());
		zipDTO.setNote(zip.getNote());
		zipDTO.setShowYes(zip.getShowYes());
		zipDTO.setRoom(zip.getRoom());
		zipDTO.setToilet(zip.getToilet());
		zipDTO.setMaintenanceFee(zip.getMaintenanceFee());
		zipDTO.setPremium(zip.getPremium());
		return zipDTO;
	}


}
