package mpr.junit;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HamcrestTest2 {

	@Test
	public void colorShouldBeRGB() {
		String color = "blue";
		assertThat(color, isOneOf("red","green","blue"));
	}
	
	@Test
	public void colorListShouldContainBlue() {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		assertThat(colors, hasItem("blue"));
	}

	@Test
	public void colorListShouldContainGivenColors() {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		assertThat(colors, hasItems("blue", "green"));
	}

	@Test
	public void colorListShouldContainAnyOfGivenColors() {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		assertThat(colors, hasItem(anyOf(is("blue"), is("green"))));
	}

}
