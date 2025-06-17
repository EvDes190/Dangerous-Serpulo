package derpulo.content;

import arc.struct.*;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;

import static derpulo.content.DerpuloSectorPresets.*;

import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;
import mindustry.content.*;
import mindustry.type.ItemStack;

public class DerpuloTechTree {
    public static void load(){
        DerpuloPlanet.derpulo.techTree = nodeRoot("derpulo", coreShard, () -> {

            node(conveyor, () -> {

                node(junction, () -> {
                    node(router, () -> {
                        node(advancedLaunchPad, Seq.with(new SectorComplete(dextractionOutpost)), () -> {
                            node(landingPad, () -> {
                                node(interplanetaryAccelerator, Seq.with(new SectorComplete(dplanetaryTerminal)), () -> {

                                });
                            });
                        });

                        node(distributor);
                        node(sorter, () -> {
                            node(invertedSorter);
                            node(overflowGate, () -> {
                                node(underflowGate);
                            });
                        });
                        node(container, Seq.with(new SectorComplete(dbiomassFacility)), () -> {
                            node(unloader);
                            node(vault, Seq.with(new SectorComplete(dstainedMountains)), () -> {

                            });
                        });

                        node(itemBridge, () -> {
                            node(titaniumConveyor, Seq.with(new SectorComplete(dcraters)), () -> {
                                node(phaseConveyor, () -> {
                                    node(massDriver, () -> {

                                    });
                                });

                                node(payloadConveyor, () -> {
                                    node(payloadRouter, () -> {

                                    });
                                });

                                node(armoredConveyor, () -> {
                                    node(plastaniumConveyor, () -> {

                                    });
                                });
                            });
                        });
                    });
                });
            });

            node(coreFoundation, () -> {
                node(coreNucleus, () -> {

                });
            });

            node(mechanicalDrill, () -> {

                node(mechanicalPump, () -> {
                    node(conduit, () -> {
                        node(liquidJunction, () -> {
                            node(liquidRouter, () -> {
                                node(liquidContainer, () -> {
                                    node(liquidTank);
                                });

                                node(bridgeConduit);

                                node(pulseConduit, Seq.with(new SectorComplete(dwindsweptIslands)), () -> {
                                    node(phaseConduit, () -> {

                                    });

                                    node(platedConduit, () -> {

                                    });

                                    node(rotaryPump, () -> {
                                        node(impulsePump, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                node(graphitePress, () -> {
                    node(pneumaticDrill, Seq.with(new SectorComplete(dfrozenForest)), () -> {
                        node(cultivator, Seq.with(new SectorComplete(dbiomassFacility)), () -> {

                        });

                        node(laserDrill, () -> {
                            node(blastDrill, Seq.with(new SectorComplete(dnuclearComplex)), () -> {

                            });

                            node(waterExtractor, Seq.with(new SectorComplete(dsaltFlats)), () -> {
                                node(oilExtractor, () -> {

                                });
                            });
                        });
                    });

                    node(pyratiteMixer, () -> {
                        node(blastMixer, Seq.with(new SectorComplete(dfacility32m)), () -> {

                        });
                    });

                    node(siliconSmelter, () -> {

                        node(sporePress, () -> {
                            node(coalCentrifuge, () -> {
                                node(multiPress, () -> {
                                    node(siliconCrucible, () -> {

                                    });
                                });
                            });

                            node(plastaniumCompressor, Seq.with(new SectorComplete(dwindsweptIslands), new OnSector(dtarFields)), () -> {
                                node(phaseWeaver, Seq.with(new SectorComplete(dtarFields)), () -> {

                                });
                            });
                        });

                        node(kiln, Seq.with(new OnSector(dcraters)), () -> {
                            node(pulverizer, () -> {
                                node(incinerator, () -> {
                                    node(melter, () -> {
                                        node(surgeSmelter, () -> {

                                        });

                                        node(separator, () -> {
                                            node(disassembler, () -> {

                                            });
                                        });

                                        node(cryofluidMixer, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        //logic disabled until further notice
                        node(microProcessor, () -> {
                            node(switchBlock, () -> {
                                node(message, () -> {
                                    node(logicDisplay, () -> {
                                        node(largeLogicDisplay, () -> {

                                        });
                                    });

                                    node(memoryCell, () -> {
                                        node(memoryBank, () -> {

                                        });
                                    });
                                });

                                node(logicProcessor, () -> {
                                    node(hyperProcessor, () -> {

                                    });
                                });
                            });
                        });

                        node(illuminator, () -> {

                        });
                    });
                });


                node(combustionGenerator, Seq.with(new Research(Items.coal)), () -> {
                    node(powerNode, () -> {
                        node(powerNodeLarge, () -> {
                            node(diode, () -> {
                                node(surgeTower, () -> {

                                });
                            });
                        });

                        node(battery, () -> {
                            node(batteryLarge, () -> {

                            });
                        });

                        node(mender, () -> {
                            node(mendProjector, () -> {
                                node(forceProjector, Seq.with(new SectorComplete(dimpact0078)), () -> {
                                    node(overdriveProjector, Seq.with(new SectorComplete(dimpact0078)), () -> {
                                        node(overdriveDome, Seq.with(new SectorComplete(dimpact0078)), () -> {

                                        });
                                    });
                                });

                                node(repairPoint, () -> {
                                    node(repairTurret, () -> {

                                    });
                                });
                            });
                        });

                        node(steamGenerator, Seq.with(new SectorComplete(dcraters)), () -> {
                            node(thermalGenerator, () -> {
                                node(differentialGenerator, () -> {
                                    node(thoriumReactor, Seq.with(new Research(Liquids.cryofluid)), () -> {
                                        node(impactReactor, () -> {

                                        });

                                        node(rtgGenerator, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(solarPanel, () -> {
                            node(largeSolarPanel, () -> {

                            });
                        });
                    });
                });
            });

            node(duo, () -> {
                node(copperWall, () -> {
                    node(copperWallLarge, () -> {
                        node(scrapWall, () -> {
                            node(scrapWallLarge, () -> {
                                node(scrapWallHuge, () -> {
                                    node(scrapWallGigantic);
                                });
                            });
                        });

                        node(titaniumWall, () -> {
                            node(titaniumWallLarge);

                            node(door, () -> {
                                node(doorLarge);
                            });

                            node(plastaniumWall, () -> {
                                node(plastaniumWallLarge, () -> {

                                });
                            });
                            node(thoriumWall, () -> {
                                node(thoriumWallLarge);
                                node(surgeWall, () -> {
                                    node(surgeWallLarge);
                                    node(phaseWall, () -> {
                                        node(phaseWallLarge);
                                    });
                                });
                            });
                        });
                    });
                });

                node(scatter, () -> {
                    node(hail, Seq.with(new SectorComplete(dcraters)), () -> {
                        node(salvo, () -> {
                            node(swarmer, () -> {
                                node(cyclone, () -> {
                                    node(spectre, Seq.with(new SectorComplete(dnuclearComplex)), () -> {

                                    });
                                });
                            });

                            node(ripple, () -> {
                                node(fuse, () -> {

                                });
                            });
                        });
                    });
                });

                node(scorch, () -> {
                    node(arc, () -> {
                        node(wave, () -> {
                            node(parallax, () -> {
                                node(segment, () -> {

                                });
                            });

                            node(tsunami, () -> {

                            });
                        });

                        node(lancer, () -> {
                            node(meltdown, () -> {
                                node(foreshadow, () -> {

                                });
                            });

                            node(shockMine, () -> {

                            });
                        });
                    });
                });
            });

            node(groundFactory, () -> {

                node(dagger, () -> {
                    node(mace, () -> {
                        node(fortress, () -> {
                            node(scepter, () -> {
                                node(reign, () -> {

                                });
                            });
                        });
                    });

                    node(nova, () -> {
                        node(pulsar, () -> {
                            node(quasar, () -> {
                                node(vela, () -> {
                                    node(corvus, () -> {

                                    });
                                });
                            });
                        });
                    });

                    //override research requirements to have graphite, not coal
                    node(crawler, ItemStack.with(Items.silicon, 400, Items.graphite, 400), () -> {
                        node(atrax, () -> {
                            node(spiroct, () -> {
                                node(arkyid, () -> {
                                    node(toxopid, Seq.with(new SectorComplete(dmycelialBastion)), () -> {

                                    });
                                });
                            });
                        });
                    });
                });

                node(airFactory, () -> {
                    node(flare, () -> {
                        node(horizon, () -> {
                            node(zenith, () -> {
                                node(antumbra, () -> {
                                    node(eclipse, () -> {

                                    });
                                });
                            });
                        });

                        node(mono, () -> {
                            node(poly, () -> {
                                node(mega, () -> {
                                    node(quad, () -> {
                                        node(oct, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });

                    node(navalFactory, Seq.with(new OnSector(dwindsweptIslands)), () -> {
                        node(risso, () -> {
                            node(minke, () -> {
                                node(bryde, () -> {
                                    node(sei, () -> {
                                        node(omura, () -> {

                                        });
                                    });
                                });
                            });

                            node(retusa, Seq.with(new SectorComplete(dwindsweptIslands)), () -> {
                                node(oxynoe, Seq.with(new SectorComplete(dcoastline)), () -> {
                                    node(cyerce, () -> {
                                        node(aegires, () -> {
                                            node(navanax, Seq.with(new SectorComplete(dnavalFortress)), () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                node(additiveReconstructor, Seq.with(new SectorComplete(dcraters)), () -> {
                    node(multiplicativeReconstructor, Seq.with(new SectorComplete(dfrontier)), () -> {
                        node(exponentialReconstructor, () -> {
                            node(tetrativeReconstructor, () -> {

                            });
                        });
                    });
                });
            });

            node(dgroundZero, () -> {
                node(dfrozenForest, Seq.with(
                        new SectorComplete(dgroundZero),
                        new Research(junction),
                        new Research(router)
                ), () -> {
                    node(dcraters, Seq.with(
                            new SectorComplete(dfrozenForest),
                            new Research(mender),
                            new Research(combustionGenerator)
                    ), () -> {
                        node(dfungalPass, Seq.with(
                                new SectorComplete(dcraters),
                                new Research(groundFactory),
                                new Research(dagger)
                        ), () -> {
                            node(dfrontier, Seq.with(
                                    new SectorComplete(dbiomassFacility),
                                    new SectorComplete(dfungalPass),
                                    new Research(groundFactory),
                                    new Research(airFactory),
                                    new Research(additiveReconstructor),
                                    new Research(mace),
                                    new Research(mono)
                            ), () -> {
                                node(dovergrowth, Seq.with(
                                        new SectorComplete(dfrontier),
                                        new SectorComplete(dwindsweptIslands),
                                        new Research(multiplicativeReconstructor),
                                        new Research(fortress),
                                        new Research(ripple),
                                        new Research(salvo),
                                        new Research(cultivator),
                                        new Research(sporePress)
                                ), () -> {
                                    node(dmycelialBastion, Seq.with(
                                            new Research(atrax),
                                            new Research(spiroct),
                                            new Research(arkyid),
                                            new Research(multiplicativeReconstructor),
                                            new Research(exponentialReconstructor)
                                    ), () -> {

                                    });

                                    node(datolls, Seq.with(
                                            new SectorComplete(dwindsweptIslands),
                                            new Research(multiplicativeReconstructor),
                                            new Research(mega)
                                    ), () -> {

                                    });
                                });
                            });

                            node(dtaintedWoods, Seq.with(
                                    new SectorComplete(dbiomassFacility),
                                    new SectorComplete(dfungalPass),
                                    new Research(Items.sporePod),
                                    new Research(wave)
                            ), () -> {

                            });
                        });

                        node(druinousShores, Seq.with(
                                new SectorComplete(dcraters),
                                new Research(graphitePress),
                                new Research(kiln),
                                new Research(mechanicalPump)
                        ), () -> {
                            node(dwindsweptIslands, Seq.with(
                                    new SectorComplete(druinousShores),
                                    new Research(pneumaticDrill),
                                    new Research(hail),
                                    new Research(siliconSmelter),
                                    new Research(steamGenerator)
                            ), () -> {
                                node(dseaPort, Seq.with(
                                        new SectorComplete(dbiomassFacility),
                                        new SectorComplete(dfrontier),
                                        new SectorComplete(dfungalPass),
                                        new Research(navalFactory),
                                        new Research(risso),
                                        new Research(retusa),
                                        new Research(steamGenerator),
                                        new Research(cultivator),
                                        new Research(coalCentrifuge)
                                ), () -> {

                                });

                                node(dtarFields, Seq.with(
                                        new SectorComplete(dwindsweptIslands),
                                        new Research(coalCentrifuge),
                                        new Research(conduit),
                                        new Research(wave)
                                ), () -> {
                                    node(dimpact0078, Seq.with(
                                            new SectorComplete(dtarFields),
                                            new Research(Items.thorium),
                                            new Research(lancer),
                                            new Research(salvo),
                                            new Research(coreFoundation)
                                    ), () -> {
                                        node(ddesolateRift, Seq.with(
                                                new SectorComplete(dimpact0078),
                                                new Research(thermalGenerator),
                                                new Research(thoriumReactor),
                                                new Research(coreNucleus)
                                        ), () -> {
                                            node(dplanetaryTerminal, Seq.with(
                                                    new SectorComplete(ddesolateRift),
                                                    new SectorComplete(dnuclearComplex),
                                                    new SectorComplete(dovergrowth),
                                                    new SectorComplete(dextractionOutpost),
                                                    new SectorComplete(dsaltFlats),
                                                    new Research(risso),
                                                    new Research(minke),
                                                    new Research(bryde),
                                                    new Research(sei),
                                                    new Research(omura),
                                                    new Research(spectre),
                                                    new Research(advancedLaunchPad),
                                                    new Research(massDriver),
                                                    new Research(impactReactor),
                                                    new Research(additiveReconstructor),
                                                    new Research(exponentialReconstructor),
                                                    new Research(tetrativeReconstructor)
                                            ), () -> {
                                                node(dgeothermalStronghold, Seq.with(
                                                        new Research(omura),
                                                        new Research(navanax),
                                                        new Research(eclipse),
                                                        new Research(oct),
                                                        new Research(reign),
                                                        new Research(corvus),
                                                        new Research(toxopid)
                                                ), () -> {

                                                });

                                                node(dcruxscape, Seq.with(
                                                        new Research(omura),
                                                        new Research(navanax),
                                                        new Research(eclipse),
                                                        new Research(oct),
                                                        new Research(reign),
                                                        new Research(corvus),
                                                        new Research(toxopid)
                                                ), () -> {

                                                });
                                            });
                                        });
                                    });
                                });

                                node(dfacility32m, Seq.with(
                                        new Research(pneumaticDrill),
                                        new SectorComplete(dstainedMountains)
                                ), () -> {
                                    node(dextractionOutpost, Seq.with(
                                            new SectorComplete(dwindsweptIslands),
                                            new SectorComplete(dfungalPass),
                                            new SectorComplete(dfacility32m),
                                            new Research(groundFactory),
                                            new Research(nova),
                                            new Research(airFactory),
                                            new Research(mono)
                                    ), () -> {
                                        //TODO: removed for now
                                        /*node(polarAerodrome, Seq.with(
                                        new SectorComplete(fungalPass),
                                        new SectorComplete(desolateRift),
                                        new SectorComplete(overgrowth),
                                        new Research(multiplicativeReconstructor),
                                        new Research(zenith),
                                        new Research(swarmer),
                                        new Research(cyclone),
                                        new Research(blastDrill),
                                        new Research(blastDrill),
                                        new Research(massDriver)
                                        ), () -> {

                                        });
                                        */
                                    });
                                });

                                node(dsaltFlats, Seq.with(
                                        new SectorComplete(dwindsweptIslands),
                                        new SectorComplete(dfungalPass),
                                        new SectorComplete(dfrontier),
                                        new Research(groundFactory),
                                        new Research(additiveReconstructor),
                                        new Research(airFactory),
                                        new Research(door)
                                ), () -> {
                                    node(dtestingGrounds, Seq.with(
                                            new Research(cryofluidMixer),
                                            new Research(Liquids.cryofluid),
                                            new Research(waterExtractor),
                                            new Research(ripple)
                                    ), () -> {

                                    });

                                    node(dcoastline, Seq.with(
                                            new SectorComplete(dwindsweptIslands),
                                            new SectorComplete(dsaltFlats),
                                            new Research(navalFactory),
                                            new Research(payloadConveyor)
                                    ), () -> {

                                        node(dnavalFortress, Seq.with(
                                                new SectorComplete(dcoastline),
                                                new SectorComplete(dextractionOutpost),
                                                new Research(coreNucleus),
                                                new Research(massDriver),
                                                new Research(oxynoe),
                                                new Research(minke),
                                                new Research(bryde),
                                                new Research(cyclone),
                                                new Research(ripple)
                                        ), () -> {
                                            node(dweatheredChannels, Seq.with(
                                                    new SectorComplete(dimpact0078),
                                                    new Research(bryde),
                                                    new Research(surgeSmelter),
                                                    new Research(overdriveProjector)
                                            ), () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });

                    node(dbiomassFacility, Seq.with(
                            new SectorComplete(dfrozenForest),
                            new Research(powerNode),
                            new Research(steamGenerator),
                            new Research(scatter),
                            new Research(graphitePress)
                    ), () -> {

                        node(dstainedMountains, Seq.with(
                                new SectorComplete(dbiomassFacility),
                                new Research(pneumaticDrill),
                                new Research(siliconSmelter)
                        ), () -> {

                            //TODO bad order
                            node(dinfestedCanyons, Seq.with(
                                    new SectorComplete(dfungalPass),
                                    new SectorComplete(dfrontier),
                                    new Research(navalFactory),
                                    new Research(risso),
                                    new Research(minke),
                                    new Research(additiveReconstructor)
                            ), () -> {
                                //TODO difficulty jump!
                                node(dnuclearComplex, Seq.with(
                                        new SectorComplete(dfungalPass),
                                        new Research(thermalGenerator),
                                        new Research(laserDrill),
                                        new Research(Items.plastanium),
                                        new Research(swarmer)
                                ), () -> {

                                });
                            });


                        });
                    });
                });
            });

            nodeProduce(Items.copper, () -> {
                nodeProduce(Liquids.water, () -> {

                });

                nodeProduce(Items.lead, () -> {
                    nodeProduce(Items.titanium, () -> {
                        nodeProduce(Liquids.cryofluid, () -> {

                        });

                        nodeProduce(Items.thorium, () -> {
                            nodeProduce(Items.surgeAlloy, () -> {

                            });

                            nodeProduce(Items.phaseFabric, () -> {

                            });
                        });
                    });

                    nodeProduce(Items.metaglass, () -> {

                    });
                });

                nodeProduce(Items.sand, () -> {
                    nodeProduce(Items.scrap, () -> {
                        nodeProduce(Liquids.slag, () -> {

                        });
                    });

                    nodeProduce(Items.coal, () -> {
                        nodeProduce(Items.graphite, () -> {
                            nodeProduce(Items.silicon, () -> {

                            });
                        });

                        nodeProduce(Items.pyratite, () -> {
                            nodeProduce(Items.blastCompound, () -> {

                            });
                        });

                        nodeProduce(Items.sporePod, () -> {

                        });

                        nodeProduce(Liquids.oil, () -> {
                            nodeProduce(Items.plastanium, () -> {

                            });
                        });
                    });
                });
            });
        });
    }
}
