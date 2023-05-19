package habittracker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelManager {
  /**
   * This function creates an XLSX file named "habit_storage.xlsx" to store
   * information about user's habit records.
   * 
   * This code creates an XLSX file named "habit_storage.xlsx" to store
   * information about the user's habit records. It creates a sheet with the name
   * "HabitStorage" and defines cells with different data types, such as STRING
   * and BOOLEAN. The function sets cell values and then writes the completed
   * workbook into the habit storage file. If there is any error while creating
   * the file or writing the data, then it throws an IOException.
   * 
   * @throws IOException if the habit storage Excel file cannot be found or
   *                     accessed
   */
  public static void createHabitStorage() throws IOException {
    // Create an instance of XSSFWorkbook class, which represents the entire
    // workbook for the spreadsheet.
    XSSFWorkbook workbook = new XSSFWorkbook();
    // Create a sheet with the name "HabitStorage"
    XSSFSheet sheet = workbook.createSheet("HabitStorage");
    XSSFRow row;
    row = sheet.createRow(0);

    // Create cells for the habit name and if should repeat each day
    // createCell method is used to create new cell in a given row and return it.
    Cell habit_name = row.createCell(0, CellType.STRING);
    Cell repeat_monday = row.createCell(1, CellType.BOOLEAN);
    Cell repeat_tuesday = row.createCell(2, CellType.BOOLEAN);
    Cell repeat_wednesday = row.createCell(3, CellType.BOOLEAN);
    Cell repeat_thursday = row.createCell(4, CellType.BOOLEAN);
    Cell repeat_friday = row.createCell(5, CellType.BOOLEAN);
    Cell repeat_saturday = row.createCell(6, CellType.BOOLEAN);
    Cell repeat_sunday = row.createCell(7, CellType.BOOLEAN);

    // Set the cell values for the habit name and if should repeat each day
    habit_name.setCellValue("habit name");
    repeat_monday.setCellValue("repeat monday");
    repeat_tuesday.setCellValue("repeat tuesday");
    repeat_wednesday.setCellValue("repeat wednesday");
    repeat_thursday.setCellValue("repeat thursday");
    repeat_friday.setCellValue("repeat friday");
    repeat_saturday.setCellValue("repeat saturday");
    repeat_sunday.setCellValue("repeat sunday");

    // Write the workbook to habit storage file and close all opened object
    FileOutputStream out = new FileOutputStream(new File("habit_storage.xlsx"));
    workbook.write(out);
    workbook.close();
    out.close();
  }

  /**
   * creates new excel file for the new Habit
   * 
   * This code creates a new XLSX file with the given HabitName as the filename.
   * The function creates a sheet inside the file with the same name as the input
   * parameter. It then sets up cell contents and data type for week start date
   * and each day of the week inside that sheet. Finally, it writes the workbook
   * into a file with name HabitName.xlsx. If there is any error while creating
   * the file or writing the data, then it throws an IOException.
   * 
   * @param HabitName        the name of the habit to be added
   * @param Repeat_monday    whether the habit should be repeated on Monday
   * @param Repeat_tuesday   whether the habit should be repeated on Tuesday
   * @param Repeat_wednesday whether the habit should be repeated on Wednesday
   * @param Repeat_thursday  whether the habit should be repeated on Thursday
   * @param Repeat_friday    whether the habit should be repeated on Friday
   * @param Repeat_saturday  whether the habit should be repeated on Saturday
   * @param Repeat_sunday    whether the habit should be repeated on Sunday
   * @throws IOException if the habit storage Excel file cannot be found or
   *                     accessed
   */
  // This method creates a new XLSX file with the name 'HabitName', to store
  // information about user's habit records.
  public static void createNewHabit(String HabitName, boolean Repeat_monday,
      boolean Repeat_tuesday, boolean Repeat_wednesday,
      boolean Repeat_thursday, boolean Repeat_friday,
      boolean Repeat_saturday, boolean Repeat_sunday) throws IOException {

    // Create a new workbook and worksheet with the given habit name
    // Create an instance of XSSFWorkbook class, which represents the entire
    // workbook for the spreadsheet.
    XSSFWorkbook workbook = new XSSFWorkbook();
    // Create a sheet with the habit's name
    XSSFSheet sheet = workbook.createSheet(HabitName);
    XSSFRow row;
    row = sheet.createRow(0);

    // Create cells for the week start date and each day of the week
    // createCell method is used to create a new cell in a given row at a given
    // column index and return it.
    Cell weekStartDate = row.createCell(0, CellType.STRING);
    Cell monday = row.createCell(1, CellType.BOOLEAN);
    Cell tuesday = row.createCell(2, CellType.BOOLEAN);
    Cell wednesday = row.createCell(3, CellType.BOOLEAN);
    Cell thursday = row.createCell(4, CellType.BOOLEAN);
    Cell friday = row.createCell(5, CellType.BOOLEAN);
    Cell saturday = row.createCell(6, CellType.BOOLEAN);
    Cell sunday = row.createCell(7, CellType.BOOLEAN);

    // Set the cell values for the week start date and each day of the week
    // The value of the first cell will be "weekStartDate", and the following
    // booloean cell values will be set to their respective boolean input
    // parameters.
    weekStartDate.setCellValue("weekStartDate");
    monday.setCellValue(Repeat_monday);
    tuesday.setCellValue(Repeat_tuesday);
    wednesday.setCellValue(Repeat_wednesday);
    thursday.setCellValue(Repeat_thursday);
    friday.setCellValue(Repeat_friday);
    saturday.setCellValue(Repeat_saturday);
    sunday.setCellValue(Repeat_sunday);

    // Write the workbook to a file with the habit name and close all opened object
    FileOutputStream out = new FileOutputStream(new File(HabitName + ".xlsx"));
    workbook.write(out);
    workbook.close();
    out.close();
  }

  /**
   * This method inserts a new row to an existing XLSX file 'habit_storage.xlsx'
   * with the user's habit records.
   * 
   * This code inserts a new row into an existing XLSX file 'habit_storage.xlsx'
   * with user's habit records. It reads the input file and creates an object of
   * XSSFWorkbook class representing the entire workbook and XSSFSheet class
   * representing the selected sheet. It then gets the index of the last row in
   * the sheet, checks if the provided HabitName already exists in the sheet, and
   * returns if it does. It then creates a new row indexed one greater than the
   * last row, updates its cell contents with the respective input parameters, and
   * writes these changes back to the input file. Lastly, it closes all
   * input-output streams for proper handling of resources.
   * 
   * @param HabitName        the name of the habit to be added
   * @param Repeat_monday    whether the habit should be repeated on Monday
   * @param Repeat_tuesday   whether the habit should be repeated on Tuesday
   * @param Repeat_wednesday whether the habit should be repeated on Wednesday
   * @param Repeat_thursday  whether the habit should be repeated on Thursday
   * @param Repeat_friday    whether the habit should be repeated on Friday
   * @param Repeat_saturday  whether the habit should be repeated on Saturday
   * @param Repeat_sunday    whether the habit should be repeated on Sunday
   * @throws IOException if the habit storage Excel file cannot be found or
   *                     accessed
   */
  public static void insertNewHabit(String HabitName,
      boolean Repeat_monday,
      boolean Repeat_tuesday,
      boolean Repeat_wednesday,
      boolean Repeat_thursday,
      boolean Repeat_friday,
      boolean Repeat_saturday,
      boolean Repeat_sunday) throws IOException {

    // Open the existing file and create objects of XSSFWorkbook class representing
    // the workbook and XSSFSheet class representing the worksheet.
    FileInputStream file = new FileInputStream("habit_storage.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0);

    // Get the index of the last row in the sheet
    int lastrow = sheet.getLastRowNum();

    // Check whether the provided habit name already exists in the sheet if so
    // return and close all opened object
    for (Row row : sheet) {
      if (row.getCell(0).toString().equals(HabitName)) {
        workbook.close();
        file.close();
        return;
      }
    }

    // Create a new row at the end of the sheet and update its values with CellType
    // and respective input parameters..
    Row row = sheet.getRow(lastrow + 1);
    if (row == null) {
      row = sheet.createRow(lastrow + 1);
    }

    Cell habit_name = row.createCell(0, CellType.STRING);
    Cell repeat_monday = row.createCell(1, CellType.BOOLEAN);
    Cell repeat_tuesday = row.createCell(2, CellType.BOOLEAN);
    Cell repeat_wednesday = row.createCell(3, CellType.BOOLEAN);
    Cell repeat_thursday = row.createCell(4, CellType.BOOLEAN);
    Cell repeat_friday = row.createCell(5, CellType.BOOLEAN);
    Cell repeat_saturday = row.createCell(6, CellType.BOOLEAN);
    Cell repeat_sunday = row.createCell(7, CellType.BOOLEAN);

    habit_name.setCellValue(HabitName);
    repeat_monday.setCellValue(Repeat_monday);
    repeat_tuesday.setCellValue(Repeat_tuesday);
    repeat_wednesday.setCellValue(Repeat_wednesday);
    repeat_thursday.setCellValue(Repeat_thursday);
    repeat_friday.setCellValue(Repeat_friday);
    repeat_saturday.setCellValue(Repeat_saturday);
    repeat_sunday.setCellValue(Repeat_sunday);

    // Write changes to the file and close all input-output streams
    FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
    workbook.write(outFile);
    workbook.close();
    outFile.close();
    file.close();
  }

  /**
   * Inserts a new habit into the habit storage Excel file.
   * 
   * This code edits an existing record of habit provided with new input values
   * and updates it in 'habit_storage.xlsx' file. The method reads the input file
   * and creates objects of XSSFWorkbook class representing the entire workbook
   * and XSSFSheet class representing the selected sheet. It then looks for the
   * row that matches the provided habit name, creates or retrieves existing cell
   * references, and updates them with new input values. If no matching row
   * exists, it returns a message "Habit not found". Lastly, the updated file is
   * written back and all input/output streams are closed.
   * 
   * @param HabitName        the name of the habit to be added
   * @param edittedHabitName the name that is changing to
   * @param Repeat_monday    whether the habit should be repeated on Monday
   * @param Repeat_tuesday   whether the habit should be repeated on Tuesday
   * @param Repeat_wednesday whether the habit should be repeated on Wednesday
   * @param Repeat_thursday  whether the habit should be repeated on Thursday
   * @param Repeat_friday    whether the habit should be repeated on Friday
   * @param Repeat_saturday  whether the habit should be repeated on Saturday
   * @param Repeat_sunday    whether the habit should be repeated on Sunday
   * @throws IOException if the habit storage Excel file cannot be found or
   *                     accessed
   */
  // This method edits the existing record of habit provided with new input values
  // and updates it in an existing XLSX file 'habit_storage.xlsx'.
  public static void editHabit(String habitName,
      String editedHabitName,
      boolean Repeat_monday,
      boolean Repeat_tuesday,
      boolean Repeat_wednesday,
      boolean Repeat_thursday,
      boolean Repeat_friday,
      boolean Repeat_saturday,
      boolean Repeat_sunday) throws IOException {

    FileInputStream file = new FileInputStream("habit_storage.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0);

    // Replace "oldFileName.xlsx" with the actual name of your Excel file
    File oldFile = new File(habitName + ".xlsx");

    // Replace "newFileName.xlsx" with the desired new name for your Excel file
    File newFile = new File(editedHabitName + ".xlsx");

    if (oldFile.renameTo(newFile)) {
      System.out.println("Excel file name changed successfully.");
    } else {
      System.out.println("Excel file name could not be changed.");
    }

    // Check where the habit is located.
    Row row = sheet.getRow(-1);
    for (Row r : sheet) {
      if (r.getCell(0).toString().equals(habitName)) {
        System.out.println(habitName + " found successfully");
        row = r;
        break;
      }
    }

    // Return if habit not found and close all input-output streams
    if (row == null) {
      System.out.println("Habit not found");
      workbook.close();
      file.close();
      return;
    }

    // Create new cells or get existing cell references using indexes 0 to 7 from
    // the row retrieved above.
    Cell habit_name = row.createCell(0, CellType.STRING);
    Cell repeat_monday = row.createCell(1, CellType.BOOLEAN);
    Cell repeat_tuesday = row.createCell(2, CellType.BOOLEAN);
    Cell repeat_wednesday = row.createCell(3, CellType.BOOLEAN);
    Cell repeat_thursday = row.createCell(4, CellType.BOOLEAN);
    Cell repeat_friday = row.createCell(5, CellType.BOOLEAN);
    Cell repeat_saturday = row.createCell(6, CellType.BOOLEAN);
    Cell repeat_sunday = row.createCell(7, CellType.BOOLEAN);

    // Update cell contents with new input values.
    habit_name.setCellValue(editedHabitName);
    repeat_monday.setCellValue(Repeat_monday);
    repeat_tuesday.setCellValue(Repeat_tuesday);
    repeat_wednesday.setCellValue(Repeat_wednesday);
    repeat_thursday.setCellValue(Repeat_thursday);
    repeat_friday.setCellValue(Repeat_friday);
    repeat_saturday.setCellValue(Repeat_saturday);
    repeat_sunday.setCellValue(Repeat_sunday);

    // Write changes to the file and close all input-output streams
    FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
    workbook.write(outFile);
    workbook.close();
    outFile.close();
    file.close();
  }

  /**
   * This method deletes a habit from an Excel spreadsheet
   * 
   * This method removes a habit from an Excel file named "habit_storage.xlsx".
   * 
   * The method takes a string `habitName` as its parameter and uses Apache POI
   * library to interact with the spreadsheet.
   *
   * The code searches for the row corresponding to the habit to be deleted,
   * removes it from the sheet, shifts any rows below it up by one, and saves the
   * changes to the file.
   * 
   * If the habit cannot be found in the sheet, an error message is printed and
   * the method exits without making any changes to the file.
   * 
   * @param habitName the name of the habit to delete from the spreadsheet
   * @throws IOException if there is an error reading or writing to the file
   */
  public static void deletehabit(String habitName) throws IOException {
    FileInputStream file = new FileInputStream("habit_storage.xlsx");

    // Create workbook object from Excel file stream
    XSSFWorkbook workbook = new XSSFWorkbook(file);

    // Select the first sheet in the workbook
    XSSFSheet sheet = workbook.getSheetAt(0);

    // Look for the row of the habit to be deleted
    Row rowToDelete = sheet.getRow(-1);
    for (Row r : sheet) {
      if (r.getCell(0).toString().equals(habitName)) {
        rowToDelete = r;
        break;
      }
    }

    // If the habit was not found, print error message and exit method
    if (rowToDelete == null) {
      System.out.println("Habit not found");
      workbook.close();
      file.close();
      return;
    }

    // Get the index of the row to be deleted
    int deleteRowIndex = rowToDelete.getRowNum();

    // Remove the row from the sheet
    sheet.removeRow(rowToDelete);

    // If there are still rows in the sheet, shift them up to fill the gap created
    // by the deleted row
    if (sheet.getLastRowNum() > deleteRowIndex) {
      sheet.shiftRows(deleteRowIndex + 1, sheet.getLastRowNum(), -1);
    }

    // Save the changes to the workbook and close all input/output streams
    FileOutputStream outFile = new FileOutputStream("habit_storage.xlsx");
    workbook.write(outFile);
    workbook.close();
    outFile.close();
    file.close();

    // Delete any associated files with the habit being deleted
    deleteHabitFile(habitName);
  }

  /**
   * This method deletes the specified Excel file based on the provided habit
   * name.
   * 
   * This code deletes a specified Excel file based on the provided habit name.
   * The method takes in the habit name and constructs the file path by appending
   * the name with '.xlsx' extension and then gets the current working directory
   * of the project. It then creates a File object with the constructed file path
   * and checks if the file exists. If the file exists, it calls the delete()
   * method to delete the file and prints a message confirming that the file has
   * been deleted, otherwise, it prints a message indicating that the file does
   * not exist.
   * 
   * @param habitName the name of the habit whose file is to be deleted
   */
  private static void deleteHabitFile(String habitName) {
    // Specify the name of the Excel file that you want to delete
    String fileName = habitName + ".xlsx";

    // Get the current working directory of the project
    String projectDirectory = System.getProperty("user.dir");

    // Construct the file path of the Excel file using the project directory
    String filePath = projectDirectory + File.separator + fileName;

    // Create a file object with the specified file path
    File file = new File(filePath);

    // Check if the file exists, delete it and print a message to confirm that the
    // file has been deleted.
    if (file.exists()) {
      file.delete();
      System.out.println("File deleted successfully.");
    } else { // Print a message to indicate that the file does not exist
      System.out.println("File does not exist.");
    }
  }

  /**
   * This method reads the habit list from an Excel file and returns an ArrayList
   * of habit names.
   * 
   * This code reads the habit list from an Excel file named "habit_storage.xlsx"
   * and returns an ArrayList of habit names. It creates a FileInputStream object
   * with the specified file name and then creates an XSSFWorkbook object to
   * represent the Excel workbook. It gets the first sheet of the workbook and
   * loops through each row of the sheet, starting from the second row (index 1),
   * as the first row contains header information.
   * 
   * On each iteration of the loop, it gets the cell at index 0 (column A) of the
   * current row and adds its string value to the ArrayList of habit names. It
   * then increments the rowNumber counter to keep track of the current row
   * number.
   * 
   * After looping through all rows, the code closes the FileInputStream and
   * XSSFWorkbook objects and returns the ArrayList of habit names. Note that if
   * the file "habit_storage.xlsx" does not exist, the code will throw a
   * FileNotFoundException at runtime.
   * 
   * @return An ArrayList of strings containing the habit names
   * @throws IOException If the file cannot be read
   */
  public static ArrayList<String> readHabitList() throws IOException {
    FileInputStream file = new FileInputStream("habit_storage.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet of the workbook
    int rowNumber = 0;
    ArrayList<String> habitNames = new ArrayList<String>();

    // Loop through each row of the sheet and add the cell value of the first column
    // to the ArrayList
    for (Row row : sheet) {
      if (rowNumber > 0) { // Skip the first row as it contains header information
        Cell cell = row.getCell(0); // Get the cell at index 0
        System.out.println(cell.toString()); // Print the cell value as a string-
        habitNames.add(cell.toString()); // Add the cell value to the ArrayList
      }
      rowNumber++;
    }

    file.close(); // Close the FileInputStream object
    workbook.close(); // Close the XSSFWorkbook object
    return habitNames; // Return the ArrayList of habit names
  }

  /**
   * This method returns an ArrayList of Booleans that represent the days a habit
   * is enabled, given its name as input parameter.
   * 
   * This code takes a String habitName as input and returns an ArrayList of
   * Booleans representing the days of the week on which the habit is enabled.
   * 
   * It creates a FileInputStream object with the specified file name and then
   * creates an XSSFWorkbook object to represent the Excel workbook. It gets the
   * first sheet of the workbook and loops through each row until it finds the row
   * where the value in the first column matches the input habitName. On each
   * iteration of the outer loop, it checks if the value of the first cell of the
   * current row equals habitName. If it does, then it enters an inner loop that
   * loops through each cell of the current row, starting from the second column
   * (index 1).
   * 
   * On each iteration of the inner loop, it prints the value of the cell as a
   * string and adds its boolean value to the ArrayList of enable days. After
   * looping through all cells of the current row, the code exits the outer loop
   * using the break statement, since we have found the desired row.
   * 
   * Finally, the code closes the FileInputStream and XSSFWorkbook objects and
   * returns the ArrayList of Boolean values representing the enable days of the
   * habit. Note that if no matching row is found, the method will simply return
   * an empty ArrayList.
   * 
   * @param habitName The name of the habit to retrieve the enable days for.
   * @return An ArrayList of Boolean values representing the days of the week when
   *         the habit is enabled.
   * @throws IOException If there is an error reading the Excel file.
   */
  public static ArrayList<Boolean> getHabitEnableDay(String habitName) throws IOException {
    FileInputStream file = new FileInputStream("habit_storage.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet of the workbook
    ArrayList<Boolean> habitEnableDay = new ArrayList<Boolean>();

    // Loop through each row of the sheet until the habit name is found in the first
    // column
    for (Row row : sheet) {
      if (row.getCell(0).toString().equals(habitName)) {
        System.out.println(habitName + "found successfully"); // Print success message
        // Loop through each cell of the current row, starting from the second column
        for (int cellnumber = 1; cellnumber <= 7; cellnumber++) {
          System.out.println(cellnumber + " : " + row.getCell(cellnumber).toString()); // Print cell value
          habitEnableDay.add(row.getCell(cellnumber).getBooleanCellValue()); // Add cell value to ArrayList
        }
        break; // Exit outer loop
      }
    }

    file.close(); // Close the FileInputStream object
    workbook.close(); // Close the XSSFWorkbook object
    return habitEnableDay; // Return the ArrayList of Boolean values
  }

  /**
   * This method inserts habit tracking data into an Excel file for a given habit
   * name and a set of Booleans indicating which days the habit was tracked.
   * 
   * This code adds a row of habit tracking data to an Excel file for a given
   * habit name and set of Boolean values indicating which days the habit was
   * tracked.
   * 
   * It opens the specified Excel file using a FileInputStream object and creates
   * an XSSFWorkbook object to represent the workbook. It then get the first sheet
   * of the workbook and the last row index of the sheet.
   * 
   * The code loops through each row of the sheet (excluding the header row),
   * comparing the week-starting date in the first cell of each row to the
   * week-starting date of the current week. If it finds a matching date, it sets
   * the current row to this matching row and updates the corresponding row with
   * the day tracking data.
   * 
   * If it doesn't find a matching date, it creates a new row at the end of the
   * sheet with the appropriate week-starting date and day tracking data.
   * 
   * Finally, the code writes the updated workbook to the output file using a
   * FileOutputStream object, prints a success message, and closes both the input
   * and output files.
   * 
   * Note that this code assumes that the Excel file already exists and has a
   * correctly formatted header row.
   * 
   * @param habitName  a String representing the name of the habit being tracked,
   *                   used to open the corresponding Excel file.
   * @param monChecked a Boolean representing whether the habit was completed on
   *                   Monday.
   * @param tueChecked a Boolean representing whether the habit was completed on
   *                   Tuesday.
   * @param wedChecked a Boolean representing whether the habit was completed on
   *                   Wednesday.
   * @param thuChecked a Boolean representing whether the habit was completed on
   *                   Thursday.
   * @param friChecked a Boolean representing whether the habit was completed on
   *                   Friday.
   * @param satChecked a Boolean representing whether the habit was completed on
   *                   Saturday.
   * @param sunChecked a Boolean representing whether the habit was completed on
   *                   Sunday.
   * @throws IOException if there is an error reading or writing to the Excel
   *                     file.
   */
  public static void insertHabitTrack(String habitName,
      Boolean monChecked,
      Boolean tueChecked,
      Boolean wedChecked,
      Boolean thuChecked,
      Boolean friChecked,
      Boolean satChecked,
      Boolean sunChecked) throws IOException {
    FileInputStream file = new FileInputStream(habitName + ".xlsx"); // Open the Excel file for the specified habit name
    XSSFWorkbook workbook = new XSSFWorkbook(file); // Create an XSSFWorkbook object to represent the Excel workbook
    XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet of the workbook
    int lastrow = sheet.getLastRowNum(); // Get the index of the last row of the sheet
    boolean dateAlreadyExist = false; // A variable to keep track of whether the current week's tracking data already
                                      // exists in the sheet
    Row row = sheet.getRow(0); // Get the first row of the sheet (this is where the headers are stored)
    System.out.println("habit file open successfully"); // Print a success message

    // Loop through each row of the sheet (starting from the second row)
    for (int r = 1; r < lastrow + 1; r++) {
      LocalDate weekStart = LocalDate.parse(sheet.getRow(r).getCell(0).toString()); // Parse the start date of the given
                                                                                    // week from the first cell of the
                                                                                    // current row
      WeekFields weekFields = WeekFields.of(Locale.getDefault()); // Get the week fields for the default locale
      int weekNumberToCheck = LocalDate.now().get(weekFields.weekOfWeekBasedYear()); // Get the week number for the
                                                                                     // current week
      int weekNumberStart = weekStart.get(weekFields.weekOfWeekBasedYear()); // Get the week number for the week
                                                                             // indicated by the start date
      dateAlreadyExist = weekNumberToCheck == weekNumberStart; // Check if the current row's week number matches the
                                                               // current week's week number
      if (dateAlreadyExist) {
        System.out.println("is the same week : " + dateAlreadyExist); // Print a message indicating that the week's
                                                                      // tracking data already exists
        row = sheet.getRow(r); // Set the current row to the one with matching week data
      }
    }

    // If the week's tracking data doesn't exist in the sheet, create a new row for
    // it
    if (dateAlreadyExist == false) {
      System.out.println("date does not exist in data, creating new row");
      row = sheet.createRow(lastrow + 1); // Create a new row at the end of the sheet
      LocalDate monday = LocalDate.now().with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY)); // Get the
                                                                                                             // date for
                                                                                                             // the most
                                                                                                             // recent
                                                                                                             // Monday
                                                                                                             // using
                                                                                                             // the
                                                                                                             // TemporalAdjusters
                                                                                                             // API
      row.createCell(0, CellType.BOOLEAN).setCellValue(monday.toString()); // Set the value of the first cell of the new
                                                                           // row to the Monday date
    }

    // Create cells for each day of the week and set their values to the
    // corresponding Booleans passed as input parameters
    Cell mon = row.createCell(1, CellType.BOOLEAN);
    Cell tue = row.createCell(2, CellType.BOOLEAN);
    Cell wed = row.createCell(3, CellType.BOOLEAN);
    Cell thu = row.createCell(4, CellType.BOOLEAN);
    Cell fri = row.createCell(5, CellType.BOOLEAN);
    Cell sat = row.createCell(6, CellType.BOOLEAN);
    Cell sun = row.createCell(7, CellType.BOOLEAN);

    mon.setCellValue(monChecked);
    tue.setCellValue(tueChecked);
    wed.setCellValue(wedChecked);
    thu.setCellValue(thuChecked);
    fri.setCellValue(friChecked);
    sat.setCellValue(satChecked);
    sun.setCellValue(sunChecked);

    FileOutputStream outFile = new FileOutputStream(habitName + ".xlsx"); // Create a FileOutputStream object to write
                                                                          // the updated workbook to file
    workbook.write(outFile); // Write the updated workbook to the FileOutputStream object
    workbook.close();
    outFile.close(); // Close the FileOutputStream object
    System.out.println("Value inserted successfully"); // Print a success message
    file.close(); // Close the FileInputStream object

  }

  /**
   * This method takes in a habitName parameter and returns an ArrayList of
   * booleans representing the habit's track data for the current week.
   * 
   * This code defines a static method named getThisWeekTrackData that takes in a
   * String parameter named habitName and returns an ArrayList of Boolean values
   * representing the track data for the current week.
   * 
   * The method first creates FileInputStream, XSSFWorkbook and XSSFSheet objects
   * to read and represent the Excel file (named after habitName) containing habit
   * tracker data. It then iterates through each row of the sheet (excluding the
   * header row) and checks if any dates in those rows match the current week. If
   * a row is found with a date that matches the current week, the method
   * retrieves the Boolean values from the cells in that row corresponding to each
   * day of the week and adds them to the ArrayList representing track data for
   * the current week. If no matching row is found for the current week, a new row
   * is created with the start date of the current week and all days initialized
   * to false.
   * 
   * Finally, the method writes any changes made to the Excel file using a
   * FileOutputStream object and saves the changes. The method also calls the
   * insertHabitTrack method to add a new row to the habit tracker database for
   * this current week if it had to create a new row. This method prints some
   * messages to the console to inform the user about the progress of its
   * execution.
   * 
   * Users can call this method by providing the name of the habit they want to
   * get the track data for as a String argument.
   * 
   * @param habitName the name of the habit to track
   * @return an ArrayList of Boolean representing this week's track data of habit
   * @throws IOException if there is an error reading the Excel file
   */

  public static ArrayList<Boolean> getThisWeekTrackData(String habitName) throws IOException {
    FileInputStream file = new FileInputStream(habitName + ".xlsx"); // Create a FileInputStream object to read the
                                                                     // Excel file (with habitName as its name)
                                                                     // containing the track data.
    XSSFWorkbook workbook = new XSSFWorkbook(file); // Create a XSSFWorkbook object to represent the Excel workbook.
    XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet of the Excel workbook.
    int lastrow = sheet.getLastRowNum(); // Get the number of the last row of the sheet.
    boolean dateAlreadyExist = false; // Initialize the variable to keep track if the date has been found to be in the
                                      // same week or not.
    Row row = sheet.getRow(0); // Get the first row of the sheet.
    ArrayList<Boolean> trackData = new ArrayList<Boolean>(); // Create ArrayList to store the track data for the current
                                                             // week.
    System.out.println("habit trackdata file open successfully"); // Print to console that the habit trackdata file was
                                                                  // opened successfully.

    for (int r = 1; r < lastrow + 1; r++) { // Iterate through all rows starting from the second row (first row is
                                            // header).
      LocalDate weekStart = LocalDate.parse(sheet.getRow(r).getCell(0).toString()); // Parse the start date of the week
                                                                                    // from the first cell of the
                                                                                    // current row to a LocalDate
                                                                                    // object.
      WeekFields weekFields = WeekFields.of(Locale.getDefault()); // Define the week fields based on the default locale.
      int weekNumberToCheck = LocalDate.now().get(weekFields.weekOfWeekBasedYear()); // Get the week number of the
                                                                                     // current date to check against.
      int weekNumberStart = weekStart.get(weekFields.weekOfWeekBasedYear()); // Get the week number of the start date of
                                                                             // the current row.
      dateAlreadyExist = weekNumberToCheck == weekNumberStart; // Check if the weeks are the same.

      if (dateAlreadyExist) { // If the weeks are the same:
        System.out.println("is the same week : " + dateAlreadyExist); // Print to console that the week is the same.
        for (int day = 1; day < 8; day++) { // Iterate through all days of the week (there are 7 days).
          System.out.println("Day " + day + " : " + sheet.getRow(r).getCell(day).getBooleanCellValue()); // Print to
                                                                                                         // console the
                                                                                                         // day and its
                                                                                                         // corresponding
                                                                                                         // boolean
                                                                                                         // value.
          Boolean dayBoolean = sheet.getRow(r).getCell(day).getBooleanCellValue(); // Get the boolean value of the
                                                                                   // current cell and store it in a
                                                                                   // Boolean variable.
          trackData.add(dayBoolean); // Add the Boolean value to the ArrayList of Boolean values representing the
                                     // track data for the current week.
        }
      }
    }

    if (dateAlreadyExist == false) { // If the current week does not exist in the sheet:
      System.out.println("date does not exist, creating new row"); // Print to console that a new row will be created.
      row = sheet.createRow(lastrow + 1); // Create a new row below the last row.
      LocalDate monday = LocalDate.now().with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY)); // Get the
                                                                                                             // Monday
                                                                                                             // of the
                                                                                                             // current
                                                                                                             // week.
      row.createCell(0, CellType.BOOLEAN).setCellValue(monday.toString()); // Set the first cell of the new row to the
                                                                           // string representation of the Monday of the
                                                                           // current week.
      for (int day = 1; day < 8; day++) { // Add boolean values for all days in the new week.
        trackData.add(false);
      }
    }

    FileOutputStream outFile = new FileOutputStream(habitName + ".xlsx"); // Create a FileOutputStream object to write
                                                                          // to the Excel file (with habitName as its
                                                                          // name) containing the track data.
    workbook.write(outFile); // Save the changes made to the workbook by writing it to the Excel file.
    workbook.close(); // Close the workbook
    outFile.close(); // Close the FileOutputStream object.
    System.out.println("got track data"); // Print to console that the track data was obtained successfully.
    file.close(); // Close the FileInputStream object.

    if (dateAlreadyExist == false) { // If a new row has been created:
      insertHabitTrack(habitName, false, false, false, false, false, false, false); // Call the insertHabitTrack method
                                                                                    // to add a new row to the habit
                                                                                    // tracker database for this current
                                                                                    // week.
    }
    return trackData; // Return an ArrayList of Boolean values representing the track data for the
                      // current week.
  }

  /**
   * This code defines a static method named getOrgonizeData that takes in a
   * String parameter named habitName and returns an ArrayList of Integer values
   * representing various tracking data for the habit passed using the habitName
   * argument.
   * 
   * The method first initializes variables for tracking various data like success
   * rate, current and best streaks, successful completions for this
   * week/month/year, number of total attempts etc. It also creates an ArrayList
   * of Booleans representing enable/disable days for this habit by calling the
   * getHabitEnableDay method.
   * 
   * It then reads in an Excel file (named after the habitName) containing habit
   * tracker data and gets its first sheet. Using multiple loops, the method
   * calculates tracking data like total attempts, success/fail count, successful
   * completions for this week/month/year and current/best streaks by iterating
   * through each row in the sheet. It also updates the all variable to exclude
   * days not included for this habit.
   * 
   * The method then writes any changes made to the Excel file using a
   * FileOutputStream object and saves the changes. Finally, it calculates the
   * success rate, adds all organized data to an ArrayList and returns it.
   * 
   * This method also prints some messages to the console to inform the user about
   * the progress of its execution.
   * 
   * @param habitName the name of the habit to track
   * @return an ArrayList of integers representing various tracking data for the
   *         habit
   * @throws IOException if there is an error reading the Excel file
   */
  public static ArrayList<Integer> getOrgonizeData(String habitName) throws IOException {

    // Initialize variables for various tracking data
    int success = 0, fail = 0, successRate = 0, currentStreak = 0, bestStreak = 0, thisWeek = 0, thisMonth = 0,
        thisYear = 0, all = 0, totaldays = 0;

    // Get ArrayList of Boolean values representing enabled/disabled days for this
    // habit
    ArrayList<Boolean> habitEnableDayArrayList = getHabitEnableDay(habitName);

    // Create ArrayList to hold organized data
    ArrayList<Integer> orgonizedData = new ArrayList<Integer>();

    // Read in the Excel file and get its first sheet
    FileInputStream file = new FileInputStream(habitName + ".xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0);

    // Get the index of the last row with data in the sheet
    int lastrow = sheet.getLastRowNum();

    System.out.println("habit trackdata file open successfully");

    /*
     * To get the the all success times, fail times and All timess.
     */

    // Iterate over each cell in the sheet to count successes and failures
    for (int r = 1; r < lastrow + 1; r++) {
      LocalDate currentDataDate = LocalDate.parse(sheet.getRow(r).getCell(0).toString());
      for (int c = 1, d = 0; c < 8; c++, d++) {
        if (!currentDataDate.isAfter(LocalDate.now())) {
          if (habitEnableDayArrayList.get((d))) {
            if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
              success++;
              all++;
              totaldays++;
            } else {
              fail++;
              totaldays++;
            }
          }
        }
        currentDataDate = currentDataDate.plusDays(1);
      }
    }

    // Subtract the number of days not included from the total count
    // all = all - notIncludedDays;
    // fail = fail - notIncludedDays;

    // Print results
    System.out.println("got all : " + all);
    System.out.println("got success : " + success);
    System.out.println("got fail : " + fail);

    /*
     * To get the complete times of this week
     */

    // Count the number of successful completions for this week
    for (int c = 1; c < 8; c++) {
      if (sheet.getRow(lastrow).getCell(c).getBooleanCellValue()) {
        thisWeek++;
      }
    }

    // Print result
    System.out.println("got complete times of this week : " + thisWeek);

    /*
     * To get the complete times of this month
     */

    // Iterate over each row in the sheet starting from the last row and break when
    // the row's date is not in the current month
    for (int r = lastrow; r > 0; r--) {
      if (LocalDate.parse(sheet.getRow(r).getCell(0).toString()).getMonth() == LocalDate.now().getMonth()) {
        // Continue counting successfully completed days if the row's date is in the
        // current month
        for (int c = 1; c < 8; c++) {
          if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
            thisMonth++;
          }
        }
      } else {
        // Count successfully completed days from previous row's date until reaching a
        // date outside of the current month
        for (int day = 1; day < 8; day++) {
          if (LocalDate.parse(sheet.getRow(r).getCell(0).toString()).plusDays(1).getMonth() == LocalDate.now()
              .getMonth()) {
            thisMonth++;
          }
        }
        break;
      }
    }

    // Print result
    System.out.println("got complete times of this month : " + thisMonth);

    /*
     * To get the complete times of this year
     */

    // Iterate over each row in the sheet starting from the last row and break when
    // the row's date is not in the current year
    for (int r = lastrow; r > 0; r--) {
      if (LocalDate.parse(sheet.getRow(r).getCell(0).toString()).getYear() == LocalDate.now().getYear()) {
        // Continue counting successfully completed days if the row's date is in the
        // current year
        for (int c = 1; c < 8; c++) {
          if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
            thisYear++;
          }
        }
      } else {
        // Count successfully completed days from previous row's date until reaching a
        // date outside of the current year
        for (int day = 1; day < 8; day++) {
          if (LocalDate.parse(sheet.getRow(r).getCell(0).toString()).plusDays(1).getYear() == LocalDate.now()
              .getYear()) {
            thisYear++;
          }
        }
        break;
      }
    }

    // Print result
    System.out.println("got complete times of this year : " + thisYear);

    /*
     * To get the Current Streak
     */

    // Get the current streak count
    currentStreak = getCurrentStreak(sheet, currentStreak, lastrow);

    // Print result
    System.out.println("got current streak : " + currentStreak);

    /*
     * To get the Best Streak
     */

    // Get the best streak count
    bestStreak = getBestStreak(sheet, bestStreak, lastrow);

    // Print result
    System.out.println("got best streak : " + bestStreak);

    // Write changes to the Excel file and close it
    FileOutputStream outFile = new FileOutputStream(habitName + ".xlsx");
    workbook.write(outFile);
    workbook.close(); // Close the workbook
    outFile.close();
    System.out.println("got track data");
    file.close();

    // Calculate success rate as percentage of total attempts
    successRate = (int) Math.round((double) success / totaldays * 100);

    // Add all organized data to ArrayList
    orgonizedData.add(success);
    orgonizedData.add(fail);
    orgonizedData.add(successRate);
    orgonizedData.add(currentStreak);
    orgonizedData.add(bestStreak);
    orgonizedData.add(thisWeek);
    orgonizedData.add(thisMonth);
    orgonizedData.add(thisYear);
    orgonizedData.add(all);

    // Return the ArrayList of organized data
    return orgonizedData;
  }

  /**
   * This method takes an XSSFSheet object, an integer representing the current
   * streak, and an integer representing the last row of the sheet as parameters.
   * It calculates and returns the current streak based on the data in the sheet.
   * 
   * This code defines a private static method named getCurrentStreak that takes
   * an XSSFSheet object, an integer currentStreak, and an integer lastrow as
   * parameters and returns the current streak count as an integer.
   * 
   * The method works by first initializing two variables lastDayCellIndex and
   * lastDate. lastDayCellIndex is initially set to 7, which represents the last
   * column of the Excel sheet. lastDate is obtained by parsing the date value
   * from the first cell of the last row of the sheet.
   * 
   * Then, the method loops through the columns of the last row, starting from the
   * first column, and checks if the date value of each column matches today's
   * date. If a match is found, the index of the last day in the sheet
   * (lastDayCellIndex) is updated and the loop is broken.
   * 
   * Next, the method iterates through the rows of the sheet backwards, starting
   * from the last row. If the current row is the last row, the method loops
   * through the columns starting from lastDayCellIndex and updates the current
   * streak count if the cell value is true. If the current row is not the last
   * row, the method loops through all the columns starting from the last column
   * and updates the current streak count if the cell value is true. The loop
   * breaks as soon as a false value is encountered.
   * 
   * Finally, the method returns the final current streak count. There is also a
   * comment above the method header that describes the purpose of the method and
   * the parameters it accepts.
   * 
   * @param sheet         - the Excel sheet containing habit data
   * @param currentStreak - the current streak count
   * @param lastrow       - the last row of data in the sheet
   * @return the current streak count
   */
  private static int getCurrentStreak(XSSFSheet sheet, int currentStreak, int lastrow) {
    // Initialize variables
    int lastDayCellIndex = 7;
    LocalDate lastDate = LocalDate.parse(sheet.getRow(lastrow).getCell(0).toString());

    // Find the index of the last day in the sheet
    for (int c = 1; c < 8; c++) {
      if (lastDate.equals(LocalDate.now())) {
        lastDayCellIndex = c;
        break;
      } else {
        lastDate = lastDate.plusDays(1);
      }
    }

    // Calculate the current streak by iterating through the sheet backwards
    for (int r = lastrow; r > 0; r--) {
      if (r == lastrow) {
        // Handle the last row of data separately, starting from the last day in the
        // sheet
        for (int c = lastDayCellIndex; c > 0; c--) {
          if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
            currentStreak++;
          } else {
            return currentStreak;
          }
        }
      }
      // Handle all other rows, starting from the last day in the row
      for (int c = 7; c > 0; c--) {
        if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
          currentStreak++;
        } else {
          return currentStreak;
        }
      }
    }

    // Return the final current streak count
    return currentStreak;
  }

  /**
   * This method takes an XSSFSheet object, the best streak count and the last row
   * index and returns the best streak count.
   * 
   * This code defines a private static method named getBestStreak that takes an
   * XSSFSheet object, an integer representing the current best streak count, and
   * an integer representing the index of the last row in the sheet. The method
   * calculates the best streak count for the given sheet and returns it.
   * 
   * The method works by iterating over each row and column in the sheet and
   * checking if the cell at the current row and column has a boolean value of
   * true. If it does, it increments a local variable thisStreak and updates the
   * best streak count if the thisStreak variable is greater than the bestStreak
   * variable. If the cell has a boolean value of false, thisStreak is reset to 0.
   * The best streak count is returned at the end of the method.
   * 
   * @param sheet      - an XSSFSheet object representing an Excel sheet
   * @param bestStreak - an integer representing the current best streak count
   * @param lastrow    - an integer representing the index of the last row in the
   *                   sheet
   * @return an integer representing the best streak count
   */
  private static int getBestStreak(XSSFSheet sheet, int bestStreak, int lastrow) {
    int thisStreak = 0;
    // Iterate over each row and column in the sheet
    for (int r = 1; r <= lastrow; r++) {
      for (int c = 1; c < 8; c++) {
        // Check if the cell at row r and column c has a boolean value of true
        if (sheet.getRow(r).getCell(c).getBooleanCellValue()) {
          thisStreak++;
          // Update the best streak count if thisStreak is greater than bestStreak
          if (thisStreak > bestStreak) {
            bestStreak = thisStreak;
          }
        } else {
          // Reset thisStreak to 0 if the cell at row r and column c has a boolean value
          // of false
          thisStreak = 0;
        }
      }
    }
    // Print the bestStreak value to console
    System.out.println("BestStreak in program : " + bestStreak);
    // Return the best streak count
    return bestStreak;
  }

  /**
   * This method deletes all Excel files (.xlsx and .xls) from the current working
   * directory of the project and creates a new habit storage file.
   * 
   * This code defines a public static method named backToStartup that deletes all
   * Excel files (.xlsx and .xls) from the current working directory of the
   * project and creates a new habit storage file.
   * 
   * The method works by getting the current working directory of the project
   * using System.getProperty("user.dir"), creating a new File object representing
   * the project directory, and getting a list of all files in the directory using
   * dir.listFiles(). It then loops through each file in the directory and checks
   * if the file has an extension of ".xlsx" or ".xls" using
   * file.getName().endsWith(".xlsx") and file.getName().endsWith(".xls"). If the
   * file is an Excel file, it is deleted using file.delete() and a message is
   * printed indicating whether the file was deleted successfully or not.
   * 
   * Finally, the createHabitStorage() method is called to create a new habit
   * storage file. There is also a comment above the method header that describes
   * the purpose of the method and any exceptions it may throw.
   * 
   * @throws IOException - if there is an error creating the habit storage file
   */
  public static void backToStartup() throws IOException {
    // Get the current working directory of the project
    String projectDir = System.getProperty("user.dir");
    // Create a new File object representing the project directory
    File dir = new File(projectDir);
    // Get a list of all files in the project directory
    File[] files = dir.listFiles();
    // Loop through each file in the directory
    for (File file : files) {
      // Check if the file is an Excel file (.xlsx or .xls)
      if (file.getName().endsWith(".xlsx") || file.getName().endsWith(".xls")) {
        // Delete the file and print a message indicating success or failure
        if (file.delete()) {
          System.out.println("Deleted file: " + file.getName());
        } else {
          System.out.println("Failed to delete file: " + file.getName());
        }
      }
    }
    // Call the createHabitStorage() method to create a new habit storage file
    createHabitStorage();
  }

  /**
   * This code defines a public static method isReachMaxHabitNum that returns a
   * Boolean value. The purpose of the method is to check if the maximum number of
   * habits saved in the excel file habit_storage.xlsx has been reached.
   * 
   * The method throws an IOException if any input/output error occurs while
   * accessing the file.
   * 
   * A FileInputStream object is created to read the habit_storage.xlsx file.
   * A new instance of XSSFWorkbook is created by reading data from the
   * FileInputStream object.
   * 
   * The method retrieves the first sheet of the workbook using getSheetAt()
   * method.
   * 
   * The index of the last row (excluding the header) in the sheet is obtained
   * using getLastRowNum().
   * 
   * If the number of rows in the sheet is equal to or greater than 6, the method
   * returns true.
   * 
   * The method closes the FileInputStream and XSSFWorkbook objects before
   * returning the respective value.
   * 
   * @return A Boolean value: true if the maximum number of habits has been
   *         reached, null otherwise
   * @throws IOException If an input/output error occurs while accessing the file
   */
  public static Boolean isReachMaxHabitNum() throws IOException {
    // Open a FileInputStream to read from the "habit_storage.xlsx" file
    FileInputStream file = new FileInputStream("habit_storage.xlsx");
    // Create a new instance of XSSFWorkbook by reading data from the given
    // InputStream file
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    // Get the first sheet of the workbook
    XSSFSheet sheet = workbook.getSheetAt(0);
    // Check if the number of rows in the sheet is equal to or greater than 6
    // (assuming header row is included)
    if (sheet.getLastRowNum() >= 6) {
      // Close the FileInputStream object before returning true
      file.close();
      // Close the workbook
      workbook.close();
      // Return true
      return true;
    }
    // Close the FileInputStream object before returning false
    file.close();
    // Close the XSSFWorkbook object before returning false
    workbook.close();
    // Return null if the maximum number of habits has not yet been reached
    return false;
  }

  /**
   * This code defines a method called `isHabitExist` which takes a
   * `String` parameter called `habitName` and checks if this habit already
   * exists in an Excel file called "habit_storage.xlsx".
   *
   * The method returns true if the habit exists in the file, false if it does
   * not exist or if the maximum number of habits has been reached. It throws an
   * `IOException` if there is an error with the input/output operations of the
   * file.
   *
   * @param habitName the name of the habit to be checked for existence
   *
   * @return true if the habit exists in the file, false otherwise or if the
   *         maximum number of habits has been reached
   *
   * @throws IOException if there is an error with the input/output operations of
   *                     the file
   */
  public static Boolean isHabitExist(String habitName) throws IOException {
    // Open a FileInputStream to read from the "habit_storage.xlsx" file
    FileInputStream file = new FileInputStream("habit_storage.xlsx");

    // Create a new instance of XSSFWorkbook by reading data from the given
    // InputStream file
    XSSFWorkbook workbook = new XSSFWorkbook(file);

    // Get the first sheet of the workbook
    XSSFSheet sheet = workbook.getSheetAt(0);

    // to check if habit already exist in habit storage
    for (Row row : sheet) {
      if (row.getCell(0).toString().equals(habitName)) {

        // Close the FileInputStream object before returning true
        file.close();

        // Close the XSSFWorkbook object before returning true
        workbook.close();

        return true;
      }
    }

    // Close the FileInputStream object before returning false
    file.close();

    // Close the XSSFWorkbook object before returning false
    workbook.close();

    // Return null if the maximum number of habits has not yet been reached
    return false;
  }

}
