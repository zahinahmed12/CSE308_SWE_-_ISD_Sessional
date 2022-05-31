import java.util.List;

public interface FileSystem {
    public String getName();
    public String getType();
    public String getDirectory();
    public void print_hierarchy_list();
    public void print_details();
    public int get_component_count();
   // public void change_dir(FileSystem f);

    public List<FileSystem> clear_main_list(List<FileSystem> f);
    public void setParent(FileSystem f);
    public FileSystem getParent();
    public List<FileSystem> get_item_list();
    public int set_component_count(int a);
    public void setDirectory(String a);

    public void addItem(FileSystem f);
    public void deleteItem();

}
