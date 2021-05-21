import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class roadsDev
{
    public static void main (String[] args) throws java.io.IOException
    {
        ArrayList<String> roadCodes = new ArrayList<String>();
	    	ArrayList<String> roadNames = new ArrayList<String>();
        ArrayList<String> changelog = new ArrayList<String>();
        ArrayList<String> homepage = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int choice = 0;

        try
        {
          Scanner s = new Scanner(new File("route-log.txt"));

          while (s.hasNextLine())
          {
            roadCodes.add(s.nextLine());
          }
          s.close();
        }
        catch (FileNotFoundException e)
        {
        }

		    try
        {
          Scanner s = new Scanner(new File("route-name.txt"));

          while (s.hasNextLine())
          {
            roadNames.add(s.nextLine());
          }
          s.close();
        }
        catch (FileNotFoundException e)
        {
        }

        try
        {
          Scanner s = new Scanner(new File("changelog.html"));
          
          while (s.hasNextLine())
          {
            changelog.add(s.nextLine());
          }
          
          s.close();
        }
        catch (FileNotFoundException e)
        {
        }

        try
        {
          Scanner s = new Scanner(new File("index.html"));
          
          while (s.hasNextLine())
          {
            homepage.add(s.nextLine());
          }
          
          s.close();
        }
        catch (FileNotFoundException e)
        {
        }

        System.out.println("Enter option");
        System.out.println("1. Add road");
        System.out.println("2. View road");
        System.out.println("3. Edit road");
        System.out.println("4. Update database");
        System.out.println("5. Update website");
        System.out.print("Option: ");
        choice = in.nextInt();

        in.nextLine(); // absorb enter key

        if (choice == 1)
        {
		  	int space = 0;

			  System.out.print("Enter previous route code: ");
			  String prevCode = in.nextLine();

			  if (prevCode.equals("0"))
	  		{
	  			space = 0;
	  		}
		  	else
		  	{
				  for (int k = 0; k < roadCodes.size(); k++)
			  	{
				  	if (roadCodes.get(k).equals(prevCode))
				  	{
					  	space = k + 1;
					  }
				  }
			  }

        System.out.print("Enter region: ");
        String region = in.nextLine();
        System.out.print("Enter route : ");
        String road = in.nextLine();
		    System.out.print("Enter name  : ");
		    roadNames.add(space, in.nextLine());
        roadCodes.add(space, region + "." + road);

        String jctPlace = "no data";
        String jctMile = "no data";
        String jctInfo = "no data";

        ArrayList<String> junctions = new ArrayList<String>();
		    ArrayList<String> places = new ArrayList<String>();
	    	ArrayList<String> miles = new ArrayList<String>();
        ArrayList<String> infos = new ArrayList<String>();

        for (int i = 0; !jctPlace.equals("0"); i++)
        {
          System.out.println("Junction " + (i + 1) + ":");
          System.out.print("Enter place: ");
          jctPlace = in.nextLine();
          if (!jctPlace.equals("0"))
          {
			      places.add(jctPlace);
            System.out.print("Enter mile: ");
            jctMile = in.nextLine();
			      miles.add(jctMile);
            System.out.print("Enter info: ");
            jctInfo = in.nextLine();
				    infos.add(jctInfo);

            junctions.add(jctPlace + " - mile " + jctMile + ": " + jctInfo);
          }
        }

          System.out.println("----------------------");
          System.out.println("File: " + region + "/" + road);

          try
          {
            File newFile1 = new File(region + "/" + road + ".txt");
            FileWriter fileWriter1 = new FileWriter(newFile1);

            fileWriter1.write(junctions.get(0) + "\n");

            for (int i = 1; i < junctions.size(); i++)
            {
              fileWriter1.append(junctions.get(i) + "\n");
            }
            fileWriter1.close();
            
            choice = 4;
          }
          catch (IOException e)
          {
          }
        }

        else if (choice == 2)
        {
          System.out.print("Enter region: ");
          String region = in.nextLine();
          System.out.print("Enter route : ");
          String road = in.nextLine();

          System.out.println("File: " + region + "/" + road + ".txt");

          ArrayList<String> junctions = new ArrayList<String>();
          try
          {
            Scanner s = new Scanner(new File(region + "/" + road + ".txt"));

            while (s.hasNextLine())
            {
              junctions.add(s.nextLine());
            }
            s.close();
          }
          catch (FileNotFoundException e)
          {
            System.out.println("Error.");
          }

          for (int i = 0; i < junctions.size(); i++)
          {
            System.out.println("Junction " + (i + 1) + ": " + junctions.get(i));
          }
        }

        else if (choice == 3)
        {
          ArrayList<String> junctions = new ArrayList<String>();

          System.out.print("Enter region: ");
          String region = in.nextLine();
          System.out.print("Enter route : ");
          String road = in.nextLine();

          try
          {
            Scanner s = new Scanner(new File(region + "/" + road + ".txt"));

            while (s.hasNextLine())
            {
              junctions.add(s.nextLine());
            }
            s.close();
          }
          catch (FileNotFoundException e)
          {
            System.out.println("Error.");
          }

          System.out.print("Enter junction before: ");
          int jctBefore = in.nextInt();
          in.nextLine(); // absorb enter key

          String jctPlace = "no data";
          String jctMile = "no data";
          String jctInfo = "no data";

          if (jctBefore == junctions.size())
          {
            for (int i = 0; !jctPlace.equals("0"); i++)
            {
              System.out.println("Junction " + (junctions.size() + 1) + ":");
              System.out.print("Enter place: ");
              jctPlace = in.nextLine();
              if (!jctPlace.equals("0"))
              {
                System.out.print("Enter mile: ");
                jctMile = in.nextLine();
                System.out.print("Enter info: ");
                jctInfo = in.nextLine();

                junctions.add(jctPlace + " - mile " + jctMile + ": " + jctInfo);
              }
            }
          }

          else
          {
            System.out.println("1. Add intermediate junction");
            System.out.println("2. Replace junction");
            System.out.print("Choice: ");
            int editChoice = in.nextInt();
            in.nextLine(); // absorb enter key
            System.out.println("Junction " + (jctBefore + 1) + ":");
            System.out.print("Enter place: ");
            jctPlace = in.nextLine();
            System.out.print("Enter mile: ");
            jctMile = in.nextLine();
            System.out.print("Enter info: ");
            jctInfo = in.nextLine();

            if (editChoice == 1)
            {
              junctions.add(jctBefore, jctPlace + " - mile " + jctMile + ": " + jctInfo);
            }
            else if (editChoice == 2)
            {
              junctions.remove(jctBefore);
              junctions.add(jctBefore, jctPlace + " - mile " + jctMile + ": " + jctInfo);
            }
          }

          try
          {
            File newFile = new File(region + "/" + road + ".txt");
            FileWriter fileWriter = new FileWriter(newFile);

            fileWriter.write(junctions.get(0) + "\n");

            for (int i = 1; i < junctions.size(); i++)
            {
              fileWriter.append(junctions.get(i) + "\n");
            }
            fileWriter.close();
          }
          catch (IOException e)
          {
          }

          choice = 4;
        }
		
		if (choice == 4)
		{
      try // add to route log txt file
      {
        File newFile1 = new File("route-log.txt");
        FileWriter fileWriter1 = new FileWriter(newFile1);

        fileWriter1.write(roadCodes.get(0) + "\n");

        for (int i = 1; i < roadCodes.size(); i++)
        {
          fileWriter1.append(roadCodes.get(i) + "\n");
        }
        fileWriter1.close();
      }
      catch (IOException e)
      {
      }

	    try // add to route name txt file
      {
        File newFile1 = new File("route-name.txt");
        FileWriter fileWriter1 = new FileWriter(newFile1);

        fileWriter1.write(roadNames.get(0) + "\n");

        for (int i = 1; i < roadNames.size(); i++)
        {
          fileWriter1.append(roadNames.get(i) + "\n");
        }
        fileWriter1.close();
      }
      catch (IOException e)
      {
      }

	    try // add to browser webpage
      {
        File newFile2 = new File("browse.html");
        FileWriter fileWriter2 = new FileWriter(newFile2);
		    fileWriter2.write("<!doctype html>");
		    fileWriter2.append("<html>");
		    fileWriter2.append("<head>");
		    fileWriter2.append("<title>Road Browser - Roads Database</title>");
		    fileWriter2.append("</head>");
	  	  fileWriter2.append("<body>" + "\n");
		    fileWriter2.append("<table>");
		    fileWriter2.append("<tr><th>Road Name</th>");
		    fileWriter2.append("<th>Road Code</th></tr>" + "\n");

		  for (int j = 0; j < roadNames.size(); j++)
		  {
			  fileWriter2.append("<tr>");
			  fileWriter2.append("<td>" + roadNames.get(j) + "</td>" + "\n");
			  fileWriter2.append("<td style=color:red>" + roadCodes.get(j) + "</td>" + "\n");
			  fileWriter2.append("</tr>");
		  }

		  fileWriter2.append("</table>");
		  fileWriter2.close();
      }
      catch (IOException e)
      {
      }
      System.out.println("Database updated.");
		}

    else if (choice == 5)
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter date: ");
      String updateDate = s.nextLine();      
      System.out.print("Enter change: ");
      String updateChange = s.nextLine();
      homepage.remove(9);
      homepage.add(9, "<p>This database was last updated on <b>" + updateDate + "</b>.</p>");
      changelog.add(3, "<p><b>" + updateDate + "</b><br>");
      changelog.add(4, updateChange + "</p>");

      try
      {
        File newFileC = new File("changelog.html");
        FileWriter fileWriterC = new FileWriter(newFileC);

        fileWriterC.write(changelog.get(0) + "\n");

        for (int i = 1; i < changelog.size(); i++)
        {
          fileWriterC.append(changelog.get(i) + "\n");
        }
        fileWriterC.close();
      }
      catch (IOException e)
      {
      }

      try
      {
        File newFileI = new File("index.html");
        FileWriter fileWriterI = new FileWriter(newFileI);

        fileWriterI.write(homepage.get(0) + "\n");

        for (int i = 1; i < homepage.size(); i++)
        {
          fileWriterI.append(homepage.get(i) + "\n");
        }
        fileWriterI.close();
      }
      catch (IOException e)
      {
      }
      System.out.println("Website updated.");
    }
  }
}
