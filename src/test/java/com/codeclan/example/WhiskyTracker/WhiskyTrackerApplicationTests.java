//package com.codeclan.example.WhiskyTracker;
//
//import com.codeclan.example.WhiskyTracker.models.Distillery;
//import com.codeclan.example.WhiskyTracker.models.Whisky;
//import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
//import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class WhiskyTrackerApplicationTests {
//
//	@Autowired
//	WhiskyRepository whiskyRepository;
//
//	@Autowired
//	DistilleryRepository distilleryRepository;
//
//	@Test
//	public void contextLoads() {
//	}
//
//	@Test
//	public void canFindWhiskeyByAge() {
//		List<Whisky> whisky = whiskyRepository.findWhiskiesByAge(12);
//		assertEquals(6, whisky.size());
//		assertEquals("The Rosebank 12 - Flora and Fona", whisky.get(0).getName());
//	}
//
//	@Test
//	public void canFindWhiskeyByYear() {
//		List<Whisky> whisky = whiskyRepository.findWhiskiesByYear(1991);
//		assertEquals(1, whisky.size());
//		assertEquals("The Rosebank 12 - Flora and Fona", whisky.get(0).getName());
//	}
//
//	@Test
//	public void canFindDistilleryByRegion() {
//		List<Distillery> distilleries = distilleryRepository.findDistilleryByRegion("Highland");
//		assertEquals(3, distilleries.size());
//	}
//
//
//	@Test
//	public void canFindWhiskiesFromDistilleryAndAge(){
//		Distillery distillery = distilleryRepository.getOne(1L);
//		List<Whisky> whiskies = whiskyRepository.findWhiskiesByDistilleryAndAge(distillery, 12);
//		assertEquals(1, whiskies.size());
//	}
//
//	@Test
//	public void canFindWhiskyOlderThan4(){
//		List<Whisky> whiskies = whiskyRepository.findWhiskiesByAgeGreaterThan(4);
//		assertEquals(17, whiskies.size());
//		assertEquals("Highland", whiskies.get(0).getDistillery().getRegion());
//	}
//
//	@Test
//	public void canFindWhiskyByRegion(){
//		List<Distillery> distilleries = distilleryRepository.findDistilleryByRegion("Highland");
//		List<Whisky> whiskies = whiskyRepository.findWhiskiesByRegionFromDistilleries(distilleries);
//		assertEquals(10, whiskies.size());
//	}
//
//
//}
