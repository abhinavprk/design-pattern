package abhi.practice.patterns.factory.work;

import abhi.practice.patterns.factory.core.YouTubeChannel;
import abhi.practice.patterns.factory.core.YouTubeChannelFactory;

/**
 * The implementation classes are in a different package. Their objects can not
 * be created from outside the package.
 * Only Factory class in public and can be access from outside the package.
 * This protects and hides the implementation but also provides other packages to create the
 * objects of those classes.
 *
  * <p>
 * The concrete classes can internally make the configurations that are required without even
 * exposing the details.
 */
public class FactoryCaller {
    public static void main(String[] args) {
        YouTubeChannel channel = YouTubeChannelFactory.getChannel("sports");
        channel.type();
        channel = YouTubeChannelFactory.getChannel("Abhinav");
        channel.type();
        channel = YouTubeChannelFactory.getChannel("kids");
        channel.type();
        channel = YouTubeChannelFactory.getChannel("entertainment");
        channel.type();

    }
}
