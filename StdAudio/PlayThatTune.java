
/**
 * Write a description of class PlayThatTune here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayThatTune
{
    public static void main(String[] args)
    {
        //Read a tune from StdIn and play it.
        int sps = 44100;
        for (int i = 0; i < args.length; i = i + 2)
        {
            //Read and play one note.
            int pitch = Integer.parseInt(args[i]);
            double duration = Double.parseDouble(args[i+1]);
            double hz = 440 * Math.pow(2, pitch/12.0);
            int N = (int)(sps * duration);
            double[] a = new double[N+1];
            for (int j = 0; j <= N; j++)
            {
                a[j] = Math.sin(2*Math.PI * j * hz / sps);
            }
            StdAudio.play(a);
        }
    }
}
