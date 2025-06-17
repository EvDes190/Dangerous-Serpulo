package derpulo.content;

import mindustry.type.*;
import derpulo.type.*;

public class DerpuloSectorPresets {
    public static SectorPreset
            dgroundZero,
            dcraters, dbiomassFacility, dtaintedWoods, dfrozenForest, druinousShores, dfacility32m, dwindsweptIslands, dstainedMountains, dtarFields,
            dfrontier, dfungalPass, dinfestedCanyons, datolls, dmycelialBastion, dextractionOutpost, dsaltFlats, dtestingGrounds, dovergrowth, //polarAerodrome,
            dimpact0078, ddesolateRift, dnuclearComplex, dplanetaryTerminal,
            dcoastline, dnavalFortress, dweatheredChannels, dseaPort,

    dgeothermalStronghold, dcruxscape;

    public static void load(){

        if(DerpuloPlanet.derpulo == null) return;
        dtaintedWoods = new SectorPreset("taintedWoods", DerpuloPlanet.derpulo, 221){{
            captureWave = 33;
            difficulty = 5;
        }};

        dinfestedCanyons = new SectorPreset("infestedCanyons", DerpuloPlanet.derpulo, 210){{
            difficulty = 4;
        }};

        dtestingGrounds = new SectorPreset("testingGrounds", DerpuloPlanet.derpulo, 3){{
            difficulty = 7;
            captureWave = 33;
        }};

        dweatheredChannels = new SectorPreset("weatheredChannels", DerpuloPlanet.derpulo, 39){{
            captureWave = 40;
            difficulty = 9;
        }};

        dfrontier = new SectorPreset("frontier", DerpuloPlanet.derpulo, 50){{
            difficulty = 4;
        }};

        datolls = new SectorPreset("atolls", DerpuloPlanet.derpulo, 1){{
            difficulty = 7;
        }};

        dmycelialBastion = new SectorPreset("mycelialBastion", DerpuloPlanet.derpulo, 260){{
            difficulty = 8;
        }};

        dgeothermalStronghold = new SectorPreset("geothermalStronghold", DerpuloPlanet.derpulo, 264){{
            difficulty = 10;
        }};

        dcruxscape = new SectorPreset("cruxscape", DerpuloPlanet.derpulo, 54){{
            difficulty = 10;
        }};

        dseaPort = new SectorPreset("seaPort", DerpuloPlanet.derpulo, 47){{
            difficulty = 4;
        }};

        dfacility32m = new SectorPreset("facility32m", DerpuloPlanet.derpulo, 64){{
            captureWave = 25;
            difficulty = 4;
        }};
        dgroundZero = new DerpuloSectorPreset("groundZero", DerpuloPlanet.derpulo, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            overrideLaunchDefaults = true;
            noLighting = true;
            startWaveTimeMultiplier = 3f;
        }};

        dsaltFlats = new DerpuloSectorPreset("saltFlats", DerpuloPlanet.derpulo, 101){{
            difficulty = 5;
        }};

        dfrozenForest = new DerpuloSectorPreset("frozenForest", DerpuloPlanet.derpulo, 86){{
            captureWave = 15;
            difficulty = 2;
        }};

        dbiomassFacility = new DerpuloSectorPreset("biomassFacility", DerpuloPlanet.derpulo, 81){{
            captureWave = 20;
            difficulty = 3;
        }};

        dcraters = new DerpuloSectorPreset("craters", DerpuloPlanet.derpulo, 18){{
            captureWave = 20;
            difficulty = 2;
        }};

        druinousShores = new DerpuloSectorPreset("ruinousShores", DerpuloPlanet.derpulo, 213){{
            captureWave = 30;
            difficulty = 3;
        }};

        dwindsweptIslands = new DerpuloSectorPreset("windsweptIslands", DerpuloPlanet.derpulo, 246){{
            captureWave = 30;
            difficulty = 4;
        }};

        dstainedMountains = new DerpuloSectorPreset("stainedMountains", DerpuloPlanet.derpulo, 20){{
            captureWave = 30;
            difficulty = 3;
        }};

        dextractionOutpost = new DerpuloSectorPreset("extractionOutpost", DerpuloPlanet.derpulo, 165){{
            difficulty = 5;
        }};

        dcoastline = new DerpuloSectorPreset("coastline", DerpuloPlanet.derpulo, 108){{
            captureWave = 30;
            difficulty = 5;
        }};

        dnavalFortress = new DerpuloSectorPreset("navalFortress", DerpuloPlanet.derpulo, 216){{
            difficulty = 9;
        }};

        dfungalPass = new DerpuloSectorPreset("fungalPass", DerpuloPlanet.derpulo, 21){{
            difficulty = 4;
        }};

        dovergrowth = new DerpuloSectorPreset("overgrowth", DerpuloPlanet.derpulo, 134){{
            difficulty = 5;
        }};

        dtarFields = new DerpuloSectorPreset("tarFields", DerpuloPlanet.derpulo, 23){{
            captureWave = 40;
            difficulty = 5;
        }};

        dimpact0078 = new DerpuloSectorPreset("impact0078", DerpuloPlanet.derpulo, 227){{
            captureWave = 45;
            difficulty = 7;
        }};

        ddesolateRift = new DerpuloSectorPreset("desolateRift", DerpuloPlanet.derpulo, 123){{
            captureWave = 18;
            difficulty = 8;
        }};

        dnuclearComplex = new DerpuloSectorPreset("nuclearComplex", DerpuloPlanet.derpulo, 130){{
            captureWave = 50;
            difficulty = 7;
        }};

        dplanetaryTerminal = new DerpuloSectorPreset("planetaryTerminal", DerpuloPlanet.derpulo, 93){{
            difficulty = 10;
            isLastSector = true;
        }};
    }
}
