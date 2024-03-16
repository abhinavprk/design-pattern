package abhi.practice.patterns.factory.core;

import java.util.Objects;

public class YouTubeChannelFactory {

   public static YouTubeChannel getChannel(String type){
       YouTubeChannel channel;
       if(Objects.isNull(type)){
           channel = null;
       } else if(type.equalsIgnoreCase("Sports")){
           channel = new Sports();
       } else if(type.equalsIgnoreCase("Kids")){
           channel = new Kids();
       } else if(type.equalsIgnoreCase("Entertainment")){
           channel = new Entertainment();
       }  else{
           channel = new Random();
       }
       return channel;
   }
}
