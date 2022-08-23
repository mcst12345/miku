package miku.Utils;

import miku.Miku.MikuLoader;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class Music_Util {
    private static final int music_count = 39;

    public static ItemStack Get_Music_Box_Reward() {
        int i;
        i = new Random().nextInt(music_count);
        switch (i) {
            case 0:
                return new ItemStack(MikuLoader.TellYourWorld);
            case 1:
                return new ItemStack(MikuLoader.Rolling_Girl);
            case 2:
                return new ItemStack(MikuLoader.Two_Face_Lovers);
            case 3:
                return new ItemStack(MikuLoader.From_Y_to_Y);
            case 4:
                return new ItemStack(MikuLoader.Deep_Sea_Lily);
            case 5:
                return new ItemStack(MikuLoader.Worlds_End_Dancehall);
            case 6:
                return new ItemStack(MikuLoader.All_happy);
            case 7:
                return new ItemStack(MikuLoader.Hibana);
            case 8:
                return new ItemStack(MikuLoader.Under_the_ground);
            case 9:
                return new ItemStack(MikuLoader.Unknown_Mother_Goose);
            case 10:
                return new ItemStack(MikuLoader.Hand_in_Hand);
            case 11:
                return new ItemStack(MikuLoader.Kagerou_Days);
            case 12:
                return new ItemStack(MikuLoader.Buriki_No_Dance);
            case 13:
                return new ItemStack(MikuLoader.Ghost_Rule);
            case 14:
                return new ItemStack(MikuLoader.Ghost_City_Tokyo);
            case 15:
                return new ItemStack(MikuLoader.LOVE_ME);
            case 16:
                return new ItemStack(MikuLoader.ODDS_ENDS);
            case 17:
                return new ItemStack(MikuLoader.Yoru_Ni_Kareru);
            case 18:
                return new ItemStack(MikuLoader.Melt);
            case 19:
                return new ItemStack(MikuLoader.Meaningless_Literature);
            case 20:
                return new ItemStack(MikuLoader.Dramaturgy);
            case 21:
                return new ItemStack(MikuLoader.End_Of_Miku);
            case 22:
                return new ItemStack(MikuLoader.End_Of_Miku_4);
            case 23:
                return new ItemStack(MikuLoader.Awake_Now);
            case 24:
                return new ItemStack(MikuLoader.Bitter_Choco);
            case 25:
                return new ItemStack(MikuLoader.Otone_Dissection);
            case 26:
                return new ItemStack(MikuLoader.Deep_Sea_Lily_Piano);
            case 27:
                return new ItemStack(MikuLoader.Hated_By_Life);
            case 28:
                return new ItemStack(MikuLoader.World_Is_Mine);
            case 29:
                return new ItemStack(MikuLoader.Vampire);
            case 30:
                return new ItemStack(MikuLoader.Senbonzakura);
            case 31:
                return new ItemStack(MikuLoader.MeltyLandNightmare);
            case 32:
                return new ItemStack(MikuLoader.SandPlanet);
            case 33:
                return new ItemStack(MikuLoader.Teo);
            case 34:
                return new ItemStack(MikuLoader.Music39);
            case 35:
                return new ItemStack(MikuLoader.Patchwork_Staccato);
            case 36:
                return new ItemStack(MikuLoader.Hitorinbo_Envy);
            case 37:
                return new ItemStack(MikuLoader.Hibikase);
            case 38:
                return new ItemStack(MikuLoader.Girl_Ray);
            default:
                return new ItemStack(MikuLoader.SCALLION);
        }
    }

    public static String GetMusicFromId(int id) {
        switch (id) {
            case 1:
                return "all_happy";
            case 2:
                return "awake_now";
            case 3:
                return "bitter_choco";
            case 4:
                return "buriki_no_dance";
            case 5:
                return "deep_sea_girl";
            case 6:
                return "deep_sea_lily";
            case 7:
                return "deep_sea_lily_piano";
            case 8:
                return "dramaturgy";
            case 9:
                return "end_of_miku";
            case 10:
                return "end_of_miku_4";
            case 11:
                return "from_Y_to_Y";
            case 12:
                return "ghost_city_tokyo";
            case 13:
                return "ghost_rule";
            case 14:
                return "hand_in_hand";
            case 15:
                return "hated_by_life";
            case 16:
                return "hibana";
            case 17:
                return "kagerou_days";
            case 18:
                return "love_me_love_me_love_me";
            case 19:
                return "meaningless_literature";
            case 20:
                return "melt";
            case 21:
                return "odds_ends";
            case 22:
                return "otone_dissection";
            case 23:
                return "rolling_girl";
            case 24:
                return "tokyo_ghetto";
            case 25:
                return "two_face_lovers";
            case 26:
                return "under_the_ground";
            case 27:
                return "unknown_mother_goose";
            case 28:
                return "world_is_mine";
            case 29:
                return "world's_end_dancehall";
            case 30:
                return "yoru_ni_kareru";
            case 31:
                return "vampire";
            case 32:
                return "tell_your_world";
            case 33:
                return "melty_land_nightmare";
            case 34:
                return "senbonzakura";
            case 35:
                return "sand_planet";
            case 36:
                return "39music";
            case 37:
                return "teo";
            case 38:
                return "patchwork_staccato";
            case 39:
                return "hibikase";
            case 40:
                return "hitorinbo_envy";
            case 41:
                return "girl_ray";
            default:
                return null;
        }
    }
}
