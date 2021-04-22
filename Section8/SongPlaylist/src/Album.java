import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        //Cek udah ada ato belom 
        Song newSong = findSong(title);
        if(newSong==null){
            //Jika belom ada, baru di add
            this.songs.add(new Song(title,duration));
            //System.out.println("Song" +title+" successfully added to "+ this.name+" album");
            return true;
        }

        System.out.println("That song already in the album!");
        return false;
    }

    private Song findSong(String title){
        for(int i =0;i<this.songs.size();i++){
            String judul = this.songs.get(i).getTitle();
            if(title.equals(judul)){
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist){
        if(track>0 && track<=songs.size()){
            //Cek apakah di playlist udah ada lagu ini ato belom
            Song songToAdd = songs.get(track-1);
            songToAdd = findSong(songToAdd.getTitle());
            if(songToAdd!=null){
                playlist.add(songToAdd);
                return true;
                    
                }
            }
    
            return false;
        }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song songToAdd = findSong(title);
        if(songToAdd!=null){
            //Cek apakah di playlist udah ada lagu ini ato belom
            playlist.add(songToAdd);
            return true; 
            }
            return false;
    }




    public void printSong(){
        System.out.println("Album : "+this.name);
        ListIterator<Song> lagulagu = songs.listIterator();
        int idx=1;
        while(lagulagu.hasNext()){
            Song song = lagulagu.next();
            System.out.println(idx+". "+song.toString()); 
            idx++;
        }
    }
}
