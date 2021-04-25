import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
        
    }

    public boolean addSong(String title, double duration){
        //Cek udah ada ato belom
        Song song = new Song(title, duration);
        return this.songs.add(song);
    }

    

    public boolean addToPlayList(int track, LinkedList<Song> playlist){
        Song song = this.songs.findSong(track);
        System.out.println(song);
        if(song!=null){
            //Cek apakah di playlist udah ada lagu ini ato belom
            playlist.add(song);
            return true;
            }
    
            return false;
        }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = this.songs.findSong(title);
        if(song!=null){
            //Cek apakah di playlist udah ada lagu ini ato belom
            playlist.add(song);
            return true; 
            }
            return false;
    }

    private class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<Song>();

        }

        private boolean add(Song song){
            //Cek udah ada ato belom 
            Song newSong = findSong(song.getTitle());
            if(newSong==null){
                //Jika belom ada, baru di add
                this.songs.add(song);
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

        private Song findSong(int position){
            position=position-1;
            if(position>=0 && position<this.songs.size()){
                return this.songs.get(position);
            
            }
            return null;
        }
    }

}
