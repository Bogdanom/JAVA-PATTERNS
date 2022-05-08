package user.repository_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CSVReader { 

	private final String FILE_NOT_FOUND_EXCEPTION = "File %s could not be found";
	private final String FILE_NOT_READ_EXCEPTION = "File %s could not be read";
	private final String FILE_NOT_CLOSE_EXCEPTION = "File %s could not be closed";

	private final String CVS_SPLIT_BY = ";";
	
	public List<List<String>> getAllCells(String path) {
		List<List<String>> allCells = new ArrayList<List<String>>();
		String row;

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			while ((row = bufferedReader.readLine()) != null) {
				allCells.add(Arrays.asList(row.split(CVS_SPLIT_BY)));
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(String.format(FILE_NOT_FOUND_EXCEPTION));
		} catch (IOException e) {
			throw new RuntimeException(String.format(FILE_NOT_READ_EXCEPTION));
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new RuntimeException(String.format(FILE_NOT_CLOSE_EXCEPTION));
				}
			}
		}
		return allCells;
	}
}
