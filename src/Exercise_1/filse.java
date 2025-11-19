package Exercise_1;


import java.io.*;

public class filse {

	public static void main(String[] args) {

		// שמות הקבצים
		String file1Name = "CS.txt";
		String file2Name = "hedva.txt";
		String outputName = "report.txt";
	//	System.out.println(System.getProperty("user.dir"));// בדיקה איפה הקבצים נמצאים
		// יצירת קבצי מקור אם הם לא קיימים
		createSampleFile1(file1Name);
		createSampleFile2(file2Name);

		// כתיבה לקובץ הפלט
		try (BufferedWriter outputFile = new BufferedWriter(new FileWriter(outputName))) {

			// קריאה מהקובץ הראשון
			try (BufferedReader file1 = new BufferedReader(new FileReader(file1Name))) {
				String line1;

				while ((line1 = file1.readLine()) != null) {
					String[] parts = line1.split(" ");// חלוקת הסטרינג למערך לפי רווחים
					String id1 = parts[2];//לקיחת הערך השני בוא נמצא הת.ז

					// קריאה מהקובץ השני
					try (BufferedReader file2 = new BufferedReader(new FileReader(file2Name))) {
						String line2;

						while ((line2 = file2.readLine()) != null) {
							String[] parts2 = line2.split(" ");//חלוקה ע״י רווחים
							String id2 = parts2[0];//ת.ז במיקום הראשון במערך שיצרנו

							if (id1.equals(id2)) {
								double avr = getAverage(parts2[1], parts2[2]);// לקיחת ציונים ועושים ממוצע
								String outputLine = parts[2] + " " + parts[0] + " " + avr;
								System.out.println(outputLine);
								outputFile.write(outputLine);
								outputFile.newLine();// ירידת שורה לאחר הדפסה
							}
						}
					}
				}
			}

			System.out.println("Create Output File " + outputName);

		} catch (IOException e) {// חריגות (אין קובץ...)
			e.printStackTrace();
		}
	}

	// יצירת קובץ CS.txt 
	private static void createSampleFile1(String fileName) {
		File f = new File(fileName);
		if (!f.exists()) {
			try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
				pw.println("Mosge Cohen 1234");
				pw.println("Dina Levi 1345");
				pw.println("Yosi Svisa 2313");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// יצירת קובץ hedva.txt 
	private static void createSampleFile2(String fileName) {
		File f = new File(fileName);
		if (!f.exists()) {
			try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
				pw.println("1234 85 75");
				pw.println("1255 56 100");
				pw.println("1345 90 86");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// חישוב ממוצע
	public static double getAverage(String str1, String str2) {
		double grade1 = Double.parseDouble(str1);// ממירים מחזדרוזת למספר (דאבל)
		double grade2 = Double.parseDouble(str2);
		return (grade1 + grade2) / 2;
	}

}


