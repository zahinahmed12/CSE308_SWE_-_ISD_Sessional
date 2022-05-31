import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<FileSystem> names_of_drives =new ArrayList<>();
        List<FileSystem> names_of_folders =new ArrayList<>();
        List<FileSystem> names_of_files =new ArrayList<>();
      while(true)
      {
          System.out.println("\n1.CREATE A DRIVE\n2.CREATE A FOLDER\n3.CREATE A FILE\n" +
                  "4.DELETE A DRIVE\n5.DELETE A FOLDER\n6.DELETE A FILE\n" +
                  "7.SHOW DETAILS OF AN ITEM\n8.SHOW HIERARCHY LIST OF AN ITEM\n" +
                  "9.EXIT");

          System.out.println("\nEXISTING DRIVES: ");
          for(int i=0;i<names_of_drives.size();i++)
          {
              System.out.println(names_of_drives.get(i).getName());
          }
          System.out.println("\nEXISTING FOLDERS: ");
          for(int i=0;i<names_of_folders.size();i++)
          {
              System.out.println(names_of_folders.get(i).getName());
          }
          System.out.println("\nEXISTING FILES: ");
          for(int i=0;i<names_of_files.size();i++)
          {
              System.out.println(names_of_files.get(i).getName());
          }
          System.out.println("\nENTER YOUR CHOICE (1-9):");

          Scanner choice= new Scanner(System.in);
          int a= choice.nextInt();

          if(a==9) break;

          else if(a==1)
          {
              /*System.out.println("\nEXISTING DRIVES: ");
              for(int i=0;i<names_of_drives.size();i++)
              {
                  System.out.println(names_of_drives.get(i).getName());
              }*/
              System.out.println("\nEnter the name of the drive ");
              Scanner d= new Scanner(System.in);
              String drive= d.nextLine();

              boolean flag=true;
              for(int i=0;i<names_of_drives.size();i++)
              {
                  if(names_of_drives.get(i).getName().equals(drive))
                  {
                      flag=false;
                      System.out.println("This drive already exists. Choose another name");
                      //continue;
                      break;
                  }
              }
              if(flag)
              {
                  FileSystem drive1=new Drives(drive);
                  names_of_drives.add(drive1);
              }

          }
          else if(a==2)
          {
              if(names_of_drives.size()==0)
              {
                  System.out.println("THERE'S NO DRIVE CURRENTLY YOU MUST CREATE A DRIVE FIRST");
                  //break;
                  continue;
              }
              /*System.out.println("\nEXISTING DRIVES: ");
              for(int i=0;i<names_of_drives.size();i++)
              {
                  System.out.println(names_of_drives.get(i).getName());
              }
              System.out.println("\nEXISTING FOLDERS: ");
              for(int i=0;i<names_of_folders.size();i++)
              {
                  System.out.println(names_of_folders.get(i).getName());
              }*/
              System.out.println("\nEnter the name of the folder ");
              Scanner f= new Scanner(System.in);
              String folder= f.nextLine();

              boolean check_flag=true;
              for(int i=0;i<names_of_folders.size();i++)
              {
                  if(names_of_folders.get(i).getName().equals(folder))
                  {
                      check_flag=false;
                      System.out.println("Choose another name for this new folder");
                      //continue;
                      break;
                  }
              }

              if(check_flag)
              {
                  System.out.println("1.Add folder to a drive\n2.Add folder to a folder");
                  Scanner cc= new Scanner(System.in);
                  int cd= cc.nextInt();
                  if(cd==1)
                  {
                      System.out.println("Enter the name of the drive");
                      Scanner ss=new Scanner(System.in);
                      String dir=ss.nextLine();
                      FileSystem folder1=new Folders(folder);
                      //folder1.setDirectory(dir+":");
                      boolean flag=true;
                      for(int i=0;i<names_of_drives.size();i++)
                      {
                          if(names_of_drives.get(i).getName().equals(dir))
                          {
                              flag=false;
                              // List<FileSystem> alist=new ArrayList<>();
                              // alist=names_of_drives.get(i).get_item_list();
                         /* for(int j=0;j<alist.size();i++)
                          {
                              if(alist.get(j).getName()==folder)
                              {
                                  System.out.println("Already exists here");
                              }
                          }*/
                              names_of_drives.get(i).addItem(folder1);
                              break;
                          }
                      }
                      if(flag)
                      {
                          System.out.println("No such drive exists! try again");
                          continue;
                      }
                      names_of_folders.add(folder1);
                  }

                  else if(cd==2)
                  {
                      System.out.println("Enter the name of the folder");
                      Scanner ss=new Scanner(System.in);
                      String dir=ss.nextLine();
                      FileSystem folder1=new Folders(folder);
                      //folder1.setDirectory(dir+":");
                      boolean flag=true;
                      for(int i=0;i<names_of_folders.size();i++)
                      {
                          if(names_of_folders.get(i).getName().equals(dir))
                          {
                              flag=false;
                              names_of_folders.get(i).addItem(folder1);
                              break;
                          }
                      }
                      if(flag)
                      {
                          System.out.println("No such folder exists! try again");
                          continue;
                      }
                      names_of_folders.add(folder1);
                  }
              }

          }
          else if(a==3)
          {
              if(names_of_drives.size()==0)
              {
                  System.out.println("THERE'S NO DRIVE CURRENTLY YOU MUST CREATE A DRIVE FIRST");
                  continue;//break;
              }
              /*System.out.println("\nEXISTING DRIVES: ");
              for(int i=0;i<names_of_drives.size();i++)
              {
                  System.out.println(names_of_drives.get(i).getName());
              }
              System.out.println("\nEXISTING FOLDERS: ");
              for(int i=0;i<names_of_folders.size();i++)
              {
                  System.out.println(names_of_folders.get(i).getName());
              }*/
              System.out.println("Enter the name of the file ");
              Scanner f= new Scanner(System.in);
              String file= f.nextLine();

              boolean check_flag=true;
              for(int i=0;i<names_of_files.size();i++)
              {
                  if(names_of_files.get(i).getName().equals(file))
                  {
                      check_flag=false;
                      System.out.println("Choose another name for this new file");
                      //continue;
                      break;
                  }
              }

              if(check_flag)
              {
                  System.out.println("1.Add file to a drive\n2.Add file to a folder");
                  Scanner cc= new Scanner(System.in);
                  int cd= cc.nextInt();
                  if(cd==1)
                  {
                      System.out.println("Enter the name of the drive");
                      Scanner ss=new Scanner(System.in);
                      String dir=ss.nextLine();
                      FileSystem file1=new Files(file);
                      //folder1.setDirectory(dir+":");
                      boolean flag=true;
                      for(int i=0;i<names_of_drives.size();i++)
                      {
                          if(names_of_drives.get(i).getName().equals(dir))
                          {
                              flag=false;
                              names_of_drives.get(i).addItem(file1);
                              break;
                          }
                      }
                      if(flag)
                      {
                          System.out.println("No such drive exists! try again");
                          continue;
                      }
                      names_of_files.add(file1);
                  }

                  else if(cd==2)
                  {
                      System.out.println("Enter the name of the folder");
                      Scanner ss=new Scanner(System.in);
                      String dir=ss.nextLine();
                      FileSystem file1=new Files(file);
                      //folder1.setDirectory(dir+":");
                      boolean flag=true;
                      for(int i=0;i<names_of_folders.size();i++)
                      {
                          if(names_of_folders.get(i).getName().equals(dir))
                          {
                              flag=false;
                              names_of_folders.get(i).addItem(file1);
                              break;
                          }
                      }
                      if(flag)
                      {
                          System.out.println("No such folder exists! try again");
                          continue;
                      }
                      names_of_files.add(file1);
                  }
              }
          }

          else if(a==4)
          {
              System.out.println("\nEnter the name of the drive");
              Scanner f= new Scanner(System.in);
              String item= f.nextLine();

              boolean flag =true;

              int index=0;
              for(int i=0;i<names_of_drives.size();i++)
              {
                  if(names_of_drives.get(i).getName().equals(item))
                  {
                      flag=false;
                      index=i;

                      List<FileSystem> prev=new ArrayList<>();
                      List<FileSystem> newL=new ArrayList<>();

                      names_of_drives.get(index).clear_main_list(prev);
                      //System.out.println(prev.size());
                      for(int b=0;b<prev.size();b++)
                      {
                          newL.add(prev.get(b));
                      }
                      // System.out.println(newL.size());
                      /*for(int b=0;b<newL.size();b++)
                      {
                          System.out.println(newL.get(b).getName());
                      }*/

                      names_of_drives.get(i).deleteItem();

                      for(int b=0;b<newL.size();b++)
                      {
                          if(newL.get(b).getType().equals("Folder"))
                          {
                              for(int j=0;j<names_of_folders.size();j++)
                              {
                                  if(names_of_folders.get(j).getName().equals(newL.get(b).getName()))
                                  {
                                      names_of_folders.remove(j);
                                      break;
                                  }
                              }
                          }
                          else
                          {
                              for(int j=0;j<names_of_files.size();j++)
                              {
                                  if(names_of_files.get(j).getName().equals(newL.get(b).getName()))
                                  {
                                      names_of_files.remove(j);
                                      break;
                                  }
                              }
                          }
                      }
                      names_of_drives.remove(index);
                      //names_of_folders.get(index).get_item_list().clear();
                      //names_of_folders.get(i).deleteItem();
                      //names_of_folders.remove(i);
                      break;

                  }
              }
              if(flag)
              {
                  System.out.println("This drive doesn't exist");
              }

          }
          else if(a==5)
          {
              System.out.println("\nEnter the name of the folder");
              Scanner f= new Scanner(System.in);
              String item= f.nextLine();

              boolean flag =true;
              int index=0;
              for(int i=0;i<names_of_folders.size();i++)
              {
                  if(names_of_folders.get(i).getName().equals(item))
                  {
                      flag=false;
                      index=i;

                      List<FileSystem> prev=new ArrayList<>();
                      List<FileSystem> newL=new ArrayList<>();

                      names_of_folders.get(index).clear_main_list(prev);
                      //System.out.println(prev.size());
                      for(int b=0;b<prev.size();b++)
                      {
                          newL.add(prev.get(b));
                      }
                     // System.out.println(newL.size());
                      /*for(int b=0;b<newL.size();b++)
                      {
                          System.out.println(newL.get(b).getName());
                      }*/

                      names_of_folders.get(i).deleteItem();

                      for(int b=0;b<newL.size();b++)
                      {
                          if(newL.get(b).getType().equals("Folder"))
                          {
                              for(int j=0;j<names_of_folders.size();j++)
                              {
                                  if(names_of_folders.get(j).getName().equals(newL.get(b).getName()))
                                  {
                                      names_of_folders.remove(j);
                                      break;
                                  }
                              }
                          }
                          else
                          {
                              for(int j=0;j<names_of_files.size();j++)
                              {
                                  if(names_of_files.get(j).getName().equals(newL.get(b).getName()))
                                  {
                                      names_of_files.remove(j);
                                      break;
                                  }
                              }
                          }
                      }
                      names_of_folders.remove(index);
                      //names_of_folders.get(index).get_item_list().clear();
                      //names_of_folders.get(i).deleteItem();
                      //names_of_folders.remove(i);
                      break;

                  }
              }
              if(flag)
              {
                  System.out.println("This folder doesn't exist");
              }
              /*else
              {
                  List<FileSystem> prev=new ArrayList<>();
                  List<FileSystem> newL=new ArrayList<>();

                  names_of_folders.get(index).clear_main_list(prev);
                  System.out.println(prev.size());
                  for(int i=0;i<prev.size();i++)
                  {
                      newL.add(prev.get(i));
                  }
                  System.out.println(newL.size());
                  for(int i=0;i<newL.size();i++)
                  {
                      System.out.println(newL.get(i).getName());
                  }
                  for(int i=0;i<newL.size();i++)
                  {
                      if(newL.get(i).getType().equals("Folder"))
                      {
                          for(int j=0;j<names_of_folders.size();j++)
                          {
                              if(names_of_folders.get(j).getName().equals(newL.get(i).getName()))
                              {
                                  names_of_folders.remove(j);
                                  break;
                              }
                          }
                      }
                      else
                      {
                          for(int j=0;j<names_of_files.size();j++)
                          {
                              if(names_of_files.get(j).getName().equals(newL.get(i).getName()))
                              {
                                  names_of_files.remove(j);
                                  break;
                              }
                          }
                      }
                  }
                  names_of_folders.remove(index);
                  names_of_folders.get(index).get_item_list().clear();
              }*/

          }
          else if(a==6)
          {
              System.out.println("\nEnter the name of the file");
              Scanner f= new Scanner(System.in);
              String item= f.nextLine();

              boolean flag =true;
              for(int i=0;i<names_of_files.size();i++)
              {
                  if(names_of_files.get(i).getName().equals(item))
                  {
                      flag=false;
                      names_of_files.get(i).deleteItem();
                      names_of_files.remove(i);
                      break;

                  }
              }
              if(flag)
              {
                  System.out.println("This file doesn't exist");
              }

          }
          else if(a==7)
          {
              /*System.out.println("\nEXISTING DRIVES: ");
              for(int i=0;i<names_of_drives.size();i++)
              {
                  System.out.println(names_of_drives.get(i).getName());
              }
              System.out.println("\nEXISTING FOLDERS: ");
              for(int i=0;i<names_of_folders.size();i++)
              {
                  System.out.println(names_of_folders.get(i).getName());
              }
              System.out.println("\nEXISTING FILES: ");
              for(int i=0;i<names_of_files.size();i++)
              {
                  System.out.println(names_of_files.get(i).getName());
              }*/
              System.out.println("\nEnter the name of the item");
              Scanner f= new Scanner(System.in);
              String item= f.nextLine();

              System.out.println("Enter the type - file/folder/drive");
              Scanner cc= new Scanner(System.in);
              String t= cc.nextLine();
              boolean flag =true;
              if(t.equals("file"))
              {
                  for(int i=0;i<names_of_files.size();i++)
                  {
                      if(names_of_files.get(i).getName().equals(item))
                      {
                          flag=false;
                          names_of_files.get(i).print_details();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! ");
                      continue;
                  }
              }
              else if(t.equals("folder"))
              {
                 // System.out.println("here1");
                 // System.out.println("size "+names_of_folders.size());
                  for(int i=0;i<names_of_folders.size();i++)
                  {
                     // System.out.println("here1");
                      if(names_of_folders.get(i).getName().equals(item))
                      {
                          //System.out.println("here2");
                          flag=false;
                          names_of_folders.get(i).print_details();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! ");
                      continue;
                  }
              }
              else if(t.equals("drive"))
              {
                  //System.out.println("here1");
                  // System.out.println("size "+names_of_folders.size());
                  for(int i=0;i<names_of_drives.size();i++)
                  {
                     // System.out.println("here2");
                      // System.out.println("size "+names_of_folders.size());
                      if(names_of_drives.get(i).getName().equals(item))
                      {
                          //System.out.println("here3");
                          // System.out.println("size "+names_of_folders.size());
                          flag=false;
                          names_of_drives.get(i).print_details();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! ");
                      continue;
                  }
              }
              else
              {
                  System.out.println("Invalid input");
              }


          }
          else if(a==8)
          {
              /*System.out.println("\nEXISTING DRIVES: ");
              for(int i=0;i<names_of_drives.size();i++)
              {
                  System.out.println(names_of_drives.get(i).getName());
              }
              System.out.println("\nEXISTING FOLDERS: ");
              for(int i=0;i<names_of_folders.size();i++)
              {
                  System.out.println(names_of_folders.get(i).getName());
              }
              System.out.println("\nEXISTING FILES: ");
              for(int i=0;i<names_of_files.size();i++)
              {
                  System.out.println(names_of_files.get(i).getName());
              }*/
              System.out.println("\nEnter the name of the item");
              Scanner f= new Scanner(System.in);
              String item= f.nextLine();

              System.out.println("Enter the type - file/folder/drive");
              Scanner cc= new Scanner(System.in);
              String type= cc.nextLine();
              boolean flag=true;
              if(type.equalsIgnoreCase("file"))
              {
                  for(int i=0;i<names_of_files.size();i++)
                  {
                      if(names_of_files.get(i).getName().equals(item))
                      {
                          flag=false;
                          names_of_files.get(i).print_hierarchy_list();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! try again");
                      continue;
                  }
              }
              else if(type.equalsIgnoreCase("folder"))
              {
                  for(int i=0;i<names_of_folders.size();i++)
                  {
                      if(names_of_folders.get(i).getName().equals(item))
                      {
                          flag=false;
                          names_of_folders.get(i).print_hierarchy_list();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! try again");
                      continue;
                  }
              }
              else if(type.equalsIgnoreCase("drive"))
              {
                  for(int i=0;i<names_of_drives.size();i++)
                  {
                      if(names_of_drives.get(i).getName().equals(item))
                      {
                          flag=false;
                          names_of_drives.get(i).print_hierarchy_list();
                          break;
                      }
                  }
                  if(flag)
                  {
                      System.out.println("No such item exists! try again");
                      continue;
                  }
              }
              else
              {
                  System.out.println("Invalid input");
              }

          }
      }

    }

}

