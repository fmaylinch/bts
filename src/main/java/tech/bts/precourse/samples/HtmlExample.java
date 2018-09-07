package tech.bts.precourse.samples;

import java.io.PrintWriter;

public class HtmlExample {

	public static void main(String[] args) throws Exception {

		PrintWriter writer = new PrintWriter("example.html");

		writer.println("<h1>Movies</h1>");
		writer.println("<h2>My favourite movies</h2>");
		writer.println("<p>Memento</p>");
		writer.println("<p>Let the right one in</p>");
		writer.println("<p>Mulholland Drive</p>");

		writer.close();
	}
}
