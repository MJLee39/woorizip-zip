//package com.example.zip_grpc.repository;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.example.zip_grpc.entity.Zip;
//import com.example.zip_grpc.repository.ZipRepository;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.test.context.ActiveProfiles;
//
//@ActiveProfiles("test")
//@SpringBootTest
//public class ZipRepositoryTest {
//
//    @Autowired
//    private ZipRepository zipRepository;
//
//    @Test
//    public void testFindByShowYes() {
//        // Given
//        Zip zip1 = new Zip();
//        zip1.setId("1");
//        zip1.setAttachments("af0a4ad6-c546-45c5-b527-32ac565b7f2d");
//        zip1.setAgentId("명진 부동산88");
//        zip1.setCheckedAt(LocalDateTime.parse("2024-04-09T15:00:00"));
//        zip1.setEstateId("d2");
//        zip1.setDirection("북향");
//        zip1.setTotalFloor(4);
//        zip1.setBuildingFloor(2);
//        zip1.setBuildingType("아파트");
//        zip1.setDeposit(3222);
//        zip1.setFee(1000);
//        zip1.setAvailable(LocalDateTime.parse("2024-04-09T15:00:00"));
//        zip1.setHashtag("#ㅇㅇ");
//        zip1.setM2(3.5F);
//        zip1.setLocation("마");
//        zip1.setShowYes("public");
//        zip1.setNote("a");
//        zip1.setRoom(3);
//        zip1.setToilet(2);
//        zip1.setMaintenanceFee(3);
//
//        zipRepository.save(zip1);
//
//        Zip zip2 = new Zip();
//        zip2.setId("2");
//        zip2.setShowYes("no");
//        zipRepository.save(zip2);
//
//        // When
//        List<Zip> showYesZips = zipRepository.findByShowYes("yes");
//
//        // Then
//        assertEquals(1, showYesZips.size());
//        assertEquals("1", showYesZips.get(0).getId());
//        assertEquals("yes", showYesZips.get(0).getShowYes());
//    }
////
////    @Test
////    public void testFindByAgentId() {
////        // Given
////        String agentId = "agent1";
////
////        Zip zip1 = new Zip();
////        zip1.setId("1");
////        zip1.setAgentId(agentId);
////        zipRepository.save(zip1);
////
////        Zip zip2 = new Zip();
////        zip2.setId("2");
////        zip2.setAgentId("agent2");
////        zipRepository.save(zip2);
////
////        // When
////        List<Zip> agentZips = zipRepository.findByAgentId(agentId);
////
////        // Then
////        assertEquals(1, agentZips.size());
////        assertEquals("1", agentZips.get(0).getId());
////        assertEquals(agentId, agentZips.get(0).getAgentId());
////    }
////
////    @Test
////    public void testFindByEstateId() {
////        // Given
////        String estateId = "estate1";
////
////        Zip zip1 = new Zip();
////        zip1.setId("1");
////        zip1.setEstateId(estateId);
////        zipRepository.save(zip1);
////
////        Zip zip2 = new Zip();
////        zip2.setId("2");
////        zip2.setEstateId("estate2");
////        zipRepository.save(zip2);
////
////        // When
////        List<Zip> estateZips = zipRepository.findByEstateId(estateId);
////
////        // Then
////        assertEquals(1, estateZips.size());
////        assertEquals("1", estateZips.get(0).getId());
////        assertEquals(estateId, estateZips.get(0).getEstateId());
////    }
//}
