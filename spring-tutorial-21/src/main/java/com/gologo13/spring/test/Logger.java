package com.gologo13.spring.test;

public class Logger {
	
	/* LoggerのbeanXMLでAutoWire ByName にすることで logger */
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public Logger(ConsoleWriter cw, FileWriter fw) {
		consoleWriter = cw;
		fileWriter = fw;
	}

	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		this.fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		this.consoleWriter.write(text);
	}
	
}
