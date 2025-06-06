package org.mtr.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockEntityTypeRegistryObject;
import org.mtr.mod.block.*;

@SuppressWarnings("unchecked")
public final class BlockEntityTypes {

	static {
		APG_DOOR = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "apg_door"), BlockAPGDoor.BlockEntity::new, Blocks.APG_DOOR::get);
		APG_GLASS = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "apg_glass"), BlockAPGGlass.BlockEntity::new, Blocks.APG_GLASS::get);
		ARRIVAL_PROJECTOR_1_LARGE = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "arrival_projector_1_large"), BlockArrivalProjector1Large.BlockEntity::new, Blocks.ARRIVAL_PROJECTOR_1_LARGE::get);
		ARRIVAL_PROJECTOR_1_MEDIUM = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "arrival_projector_1_medium"), BlockArrivalProjector1Medium.BlockEntity::new, Blocks.ARRIVAL_PROJECTOR_1_MEDIUM::get);
		ARRIVAL_PROJECTOR_1_SMALL = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "arrival_projector_1_small"), BlockArrivalProjector1Small.BlockEntity::new, Blocks.ARRIVAL_PROJECTOR_1_SMALL::get);
		CLOCK = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "clock"), BlockClock.BlockEntity::new, Blocks.CLOCK::get);
		DRIVER_KEY_DISPENSER = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "driver_key_dispenser"), BlockDriverKeyDispenser.BlockEntity::new, Blocks.DRIVER_KEY_DISPENSER::get);
		LIFT_BUTTONS_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_buttons_1"), BlockLiftButtons.BlockEntity::new, Blocks.LIFT_BUTTONS_1::get);
		LIFT_DOOR_EVEN_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_door_1"), BlockLiftDoor.BlockEntity::new, Blocks.LIFT_DOOR_EVEN_1::get);
		LIFT_DOOR_ODD_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_door_odd_1"), BlockLiftDoorOdd.BlockEntity::new, Blocks.LIFT_DOOR_ODD_1::get);
		LIFT_PANEL_EVEN_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_panel_even_1"), BlockLiftPanelEven1.BlockEntity::new, Blocks.LIFT_PANEL_EVEN_1::get);
		LIFT_PANEL_EVEN_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_panel_even_2"), BlockLiftPanelEven2.BlockEntity::new, Blocks.LIFT_PANEL_EVEN_2::get);
		LIFT_PANEL_ODD_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_panel_odd_1"), BlockLiftPanelOdd1.BlockEntity::new, Blocks.LIFT_PANEL_ODD_1::get);
		LIFT_PANEL_ODD_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_panel_odd_2"), BlockLiftPanelOdd2.BlockEntity::new, Blocks.LIFT_PANEL_ODD_2::get);
		LIFT_TRACK_FLOOR_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_track_floor_1"), BlockLiftTrackFloor.BlockEntity::new, Blocks.LIFT_TRACK_FLOOR_1::get);
		PIDS_HORIZONTAL_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "pids_1"), BlockPIDSHorizontal1.BlockEntity::new, Blocks.PIDS_1::get);
		PIDS_HORIZONTAL_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "pids_2"), BlockPIDSHorizontal2.BlockEntity::new, Blocks.PIDS_2::get);
		PIDS_HORIZONTAL_3 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "pids_3"), BlockPIDSHorizontal3.BlockEntity::new, Blocks.PIDS_3::get);
		PIDS_VERTICAL_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "pids_4"), BlockPIDSVertical1.BlockEntity::new, Blocks.PIDS_4::get);
		PIDS_VERTICAL_SINGLE_ARRIVAL_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "pids_single_arrival_1"), BlockPIDSVerticalSingleArrival1.BlockEntity::new, Blocks.PIDS_SINGLE_ARRIVAL_1::get);
		PSD_DOOR_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "psd_door_1"), (pos, state) -> new BlockPSDDoor.BlockEntity(0, pos, state), Blocks.PSD_DOOR_1::get);
		PSD_DOOR_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "psd_door_2"), (pos, state) -> new BlockPSDDoor.BlockEntity(1, pos, state), Blocks.PSD_DOOR_2::get);
		PSD_TOP = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "psd_top"), BlockPSDTop.BlockEntity::new, Blocks.PSD_TOP::get);
		RAILWAY_SIGN_2_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_2_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(2, false, pos, state), Blocks.RAILWAY_SIGN_2_EVEN::get);
		RAILWAY_SIGN_2_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_2_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(2, true, pos, state), Blocks.RAILWAY_SIGN_2_ODD::get);
		RAILWAY_SIGN_3_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_3_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(3, false, pos, state), Blocks.RAILWAY_SIGN_3_EVEN::get);
		RAILWAY_SIGN_3_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_3_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(3, true, pos, state), Blocks.RAILWAY_SIGN_3_ODD::get);
		RAILWAY_SIGN_4_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_4_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(4, false, pos, state), Blocks.RAILWAY_SIGN_4_EVEN::get);
		RAILWAY_SIGN_4_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_4_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(4, true, pos, state), Blocks.RAILWAY_SIGN_4_ODD::get);
		RAILWAY_SIGN_5_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_5_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(5, false, pos, state), Blocks.RAILWAY_SIGN_5_EVEN::get);
		RAILWAY_SIGN_5_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_5_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(5, true, pos, state), Blocks.RAILWAY_SIGN_5_ODD::get);
		RAILWAY_SIGN_6_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_6_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(6, false, pos, state), Blocks.RAILWAY_SIGN_6_EVEN::get);
		RAILWAY_SIGN_6_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_6_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(6, true, pos, state), Blocks.RAILWAY_SIGN_6_ODD::get);
		RAILWAY_SIGN_7_EVEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_7_even"), (pos, state) -> new BlockRailwaySign.BlockEntity(7, false, pos, state), Blocks.RAILWAY_SIGN_7_EVEN::get);
		RAILWAY_SIGN_7_ODD = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "railway_sign_7_odd"), (pos, state) -> new BlockRailwaySign.BlockEntity(7, true, pos, state), Blocks.RAILWAY_SIGN_7_ODD::get);
		ROUTE_SIGN_STANDING_LIGHT = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "route_sign_standing_light"), BlockRouteSignStandingLight.BlockEntity::new, Blocks.ROUTE_SIGN_STANDING_LIGHT::get);
		ROUTE_SIGN_STANDING_METAL = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "route_sign_standing_metal"), BlockRouteSignStandingMetal.BlockEntity::new, Blocks.ROUTE_SIGN_STANDING_METAL::get);
		ROUTE_SIGN_WALL_LIGHT = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "route_sign_wall_light"), BlockRouteSignWallLight.BlockEntity::new, Blocks.ROUTE_SIGN_WALL_LIGHT::get);
		ROUTE_SIGN_WALL_METAL = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "route_sign_wall_metal"), BlockRouteSignWallMetal.BlockEntity::new, Blocks.ROUTE_SIGN_WALL_METAL::get);
		SIGNAL_LIGHT_2_ASPECT_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_1"), BlockSignalLight2Aspect1.BlockEntity::new, Blocks.SIGNAL_LIGHT_2_ASPECT_1::get);
		SIGNAL_LIGHT_2_ASPECT_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_2"), BlockSignalLight2Aspect2.BlockEntity::new, Blocks.SIGNAL_LIGHT_2_ASPECT_2::get);
		SIGNAL_LIGHT_2_ASPECT_3 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_3"), BlockSignalLight2Aspect3.BlockEntity::new, Blocks.SIGNAL_LIGHT_2_ASPECT_3::get);
		SIGNAL_LIGHT_2_ASPECT_4 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_4"), BlockSignalLight2Aspect4.BlockEntity::new, Blocks.SIGNAL_LIGHT_2_ASPECT_4::get);
		SIGNAL_LIGHT_3_ASPECT_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_3_aspect_1"), BlockSignalLight3Aspect1.BlockEntity::new, Blocks.SIGNAL_LIGHT_3_ASPECT_1::get);
		SIGNAL_LIGHT_3_ASPECT_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_3_aspect_2"), BlockSignalLight3Aspect2.BlockEntity::new, Blocks.SIGNAL_LIGHT_3_ASPECT_2::get);
		SIGNAL_LIGHT_4_ASPECT_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_4_aspect_1"), BlockSignalLight4Aspect1.BlockEntity::new, Blocks.SIGNAL_LIGHT_4_ASPECT_1::get);
		SIGNAL_LIGHT_4_ASPECT_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_light_4_aspect_2"), BlockSignalLight4Aspect2.BlockEntity::new, Blocks.SIGNAL_LIGHT_4_ASPECT_2::get);
		SIGNAL_SEMAPHORE_1 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_semaphore_1"), BlockSignalSemaphore1.BlockEntity::new, Blocks.SIGNAL_SEMAPHORE_1::get);
		SIGNAL_SEMAPHORE_2 = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "signal_semaphore_2"), BlockSignalSemaphore2.BlockEntity::new, Blocks.SIGNAL_SEMAPHORE_2::get);
		STATION_NAME_ENTRANCE = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_entrance"), BlockStationNameEntrance.BlockEntity::new, Blocks.STATION_NAME_ENTRANCE::get);
		STATION_NAME_TALL_BLOCK = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_tall_block"), BlockStationNameTallBlock.BlockEntity::new, Blocks.STATION_NAME_TALL_BLOCK::get);
		STATION_NAME_TALL_BLOCK_DOUBLE_SIDED = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_tall_block_double_sided"), BlockStationNameTallBlockDoubleSided.BlockEntity::new, Blocks.STATION_NAME_TALL_BLOCK_DOUBLE_SIDED::get);
		STATION_NAME_TALL_WALL = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_tall_wall"), BlockStationNameTallWall.BlockEntity::new, Blocks.STATION_NAME_TALL_WALL::get);
		STATION_NAME_TALL_STANDING = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_tall_standing"), BlockStationNameTallStanding.BlockEntity::new, Blocks.STATION_NAME_TALL_STANDING::get);
		STATION_NAME_WALL_BLACK = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_wall_black"), BlockStationNameWallBlack.BlockEntity::new, Blocks.STATION_NAME_WALL_BLACK::get);
		STATION_NAME_WALL_GRAY = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_wall_gray"), BlockStationNameWallGray.BlockEntity::new, Blocks.STATION_NAME_WALL_GRAY::get);
		STATION_NAME_WALL_WHITE = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "station_name_wall"), BlockStationNameWallWhite.BlockEntity::new, Blocks.STATION_NAME_WALL_WHITE::get);
		TACTILE_MAP = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "tactile_map"), BlockTactileMap.BlockEntity::new, Blocks.TACTILE_MAP::get);
		TRAIN_ANNOUNCER = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "train_announcer"), BlockTrainAnnouncer.BlockEntity::new, Blocks.TRAIN_ANNOUNCER::get);
		TRAIN_CARGO_LOADER = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "train_cargo_loader"), BlockTrainCargoLoader.BlockEntity::new, Blocks.TRAIN_CARGO_LOADER::get);
		TRAIN_CARGO_UNLOADER = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "train_cargo_unloader"), BlockTrainCargoUnloader.BlockEntity::new, Blocks.TRAIN_CARGO_UNLOADER::get);
		TRAIN_REDSTONE_SENSOR = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "train_redstone_sensor"), BlockTrainRedstoneSensor.BlockEntity::new, Blocks.TRAIN_REDSTONE_SENSOR::get);
		TRAIN_SCHEDULE_SENSOR = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "train_schedule_sensor"), BlockTrainScheduleSensor.BlockEntity::new, Blocks.TRAIN_SCHEDULE_SENSOR::get);
		EYE_CANDY = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID_NTE, "eye_candy"), BlockEyeCandy.BlockEntity::new, Blocks.EYE_CANDY::get);
	}

	public static final BlockEntityTypeRegistryObject<BlockAPGDoor.BlockEntity> APG_DOOR;
	public static final BlockEntityTypeRegistryObject<BlockAPGGlass.BlockEntity> APG_GLASS;
	public static final BlockEntityTypeRegistryObject<BlockArrivalProjector1Large.BlockEntity> ARRIVAL_PROJECTOR_1_LARGE;
	public static final BlockEntityTypeRegistryObject<BlockArrivalProjector1Medium.BlockEntity> ARRIVAL_PROJECTOR_1_MEDIUM;
	public static final BlockEntityTypeRegistryObject<BlockArrivalProjector1Small.BlockEntity> ARRIVAL_PROJECTOR_1_SMALL;
	public static final BlockEntityTypeRegistryObject<BlockClock.BlockEntity> CLOCK;
	public static final BlockEntityTypeRegistryObject<BlockDriverKeyDispenser.BlockEntity> DRIVER_KEY_DISPENSER;
	public static final BlockEntityTypeRegistryObject<BlockLiftButtons.BlockEntity> LIFT_BUTTONS_1;
	public static final BlockEntityTypeRegistryObject<BlockLiftDoor.BlockEntity> LIFT_DOOR_EVEN_1;
	public static final BlockEntityTypeRegistryObject<BlockLiftDoorOdd.BlockEntity> LIFT_DOOR_ODD_1;
	public static final BlockEntityTypeRegistryObject<BlockLiftPanelEven1.BlockEntity> LIFT_PANEL_EVEN_1;
	public static final BlockEntityTypeRegistryObject<BlockLiftPanelEven2.BlockEntity> LIFT_PANEL_EVEN_2;
	public static final BlockEntityTypeRegistryObject<BlockLiftPanelOdd1.BlockEntity> LIFT_PANEL_ODD_1;
	public static final BlockEntityTypeRegistryObject<BlockLiftPanelOdd2.BlockEntity> LIFT_PANEL_ODD_2;
	public static final BlockEntityTypeRegistryObject<BlockLiftTrackFloor.BlockEntity> LIFT_TRACK_FLOOR_1;
	public static final BlockEntityTypeRegistryObject<BlockPIDSHorizontal1.BlockEntity> PIDS_HORIZONTAL_1;
	public static final BlockEntityTypeRegistryObject<BlockPIDSHorizontal2.BlockEntity> PIDS_HORIZONTAL_2;
	public static final BlockEntityTypeRegistryObject<BlockPIDSHorizontal3.BlockEntity> PIDS_HORIZONTAL_3;
	public static final BlockEntityTypeRegistryObject<BlockPIDSVertical1.BlockEntity> PIDS_VERTICAL_1;
	public static final BlockEntityTypeRegistryObject<BlockPIDSVerticalSingleArrival1.BlockEntity> PIDS_VERTICAL_SINGLE_ARRIVAL_1;
	public static final BlockEntityTypeRegistryObject<BlockPSDDoor.BlockEntity> PSD_DOOR_1;
	public static final BlockEntityTypeRegistryObject<BlockPSDDoor.BlockEntity> PSD_DOOR_2;
	public static final BlockEntityTypeRegistryObject<BlockPSDTop.BlockEntity> PSD_TOP;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_2_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_2_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_3_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_3_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_4_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_4_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_5_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_5_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_6_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_6_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_7_EVEN;
	public static final BlockEntityTypeRegistryObject<BlockRailwaySign.BlockEntity> RAILWAY_SIGN_7_ODD;
	public static final BlockEntityTypeRegistryObject<BlockRouteSignStandingLight.BlockEntity> ROUTE_SIGN_STANDING_LIGHT;
	public static final BlockEntityTypeRegistryObject<BlockRouteSignStandingMetal.BlockEntity> ROUTE_SIGN_STANDING_METAL;
	public static final BlockEntityTypeRegistryObject<BlockRouteSignWallLight.BlockEntity> ROUTE_SIGN_WALL_LIGHT;
	public static final BlockEntityTypeRegistryObject<BlockRouteSignWallMetal.BlockEntity> ROUTE_SIGN_WALL_METAL;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight2Aspect1.BlockEntity> SIGNAL_LIGHT_2_ASPECT_1;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight2Aspect2.BlockEntity> SIGNAL_LIGHT_2_ASPECT_2;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight2Aspect3.BlockEntity> SIGNAL_LIGHT_2_ASPECT_3;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight2Aspect4.BlockEntity> SIGNAL_LIGHT_2_ASPECT_4;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight3Aspect1.BlockEntity> SIGNAL_LIGHT_3_ASPECT_1;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight3Aspect2.BlockEntity> SIGNAL_LIGHT_3_ASPECT_2;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight4Aspect1.BlockEntity> SIGNAL_LIGHT_4_ASPECT_1;
	public static final BlockEntityTypeRegistryObject<BlockSignalLight4Aspect2.BlockEntity> SIGNAL_LIGHT_4_ASPECT_2;
	public static final BlockEntityTypeRegistryObject<BlockSignalSemaphore1.BlockEntity> SIGNAL_SEMAPHORE_1;
	public static final BlockEntityTypeRegistryObject<BlockSignalSemaphore2.BlockEntity> SIGNAL_SEMAPHORE_2;
	public static final BlockEntityTypeRegistryObject<BlockStationNameEntrance.BlockEntity> STATION_NAME_ENTRANCE;
	public static final BlockEntityTypeRegistryObject<BlockStationNameTallBlock.BlockEntity> STATION_NAME_TALL_BLOCK;
	public static final BlockEntityTypeRegistryObject<BlockStationNameTallStanding.BlockEntity> STATION_NAME_TALL_STANDING;
	public static final BlockEntityTypeRegistryObject<BlockStationNameTallBlockDoubleSided.BlockEntity> STATION_NAME_TALL_BLOCK_DOUBLE_SIDED;
	public static final BlockEntityTypeRegistryObject<BlockStationNameTallWall.BlockEntity> STATION_NAME_TALL_WALL;
	public static final BlockEntityTypeRegistryObject<BlockStationNameWallBlack.BlockEntity> STATION_NAME_WALL_BLACK;
	public static final BlockEntityTypeRegistryObject<BlockStationNameWallGray.BlockEntity> STATION_NAME_WALL_GRAY;
	public static final BlockEntityTypeRegistryObject<BlockStationNameWallWhite.BlockEntity> STATION_NAME_WALL_WHITE;
	public static final BlockEntityTypeRegistryObject<BlockTactileMap.BlockEntity> TACTILE_MAP;
	public static final BlockEntityTypeRegistryObject<BlockTrainAnnouncer.BlockEntity> TRAIN_ANNOUNCER;
	public static final BlockEntityTypeRegistryObject<BlockTrainCargoLoader.BlockEntity> TRAIN_CARGO_LOADER;
	public static final BlockEntityTypeRegistryObject<BlockTrainCargoUnloader.BlockEntity> TRAIN_CARGO_UNLOADER;
	public static final BlockEntityTypeRegistryObject<BlockTrainRedstoneSensor.BlockEntity> TRAIN_REDSTONE_SENSOR;
	public static final BlockEntityTypeRegistryObject<BlockTrainScheduleSensor.BlockEntity> TRAIN_SCHEDULE_SENSOR;
	public static final BlockEntityTypeRegistryObject<BlockEyeCandy.BlockEntity> EYE_CANDY;

	public static void init() {
		Init.LOGGER.info("Registering Minecraft Transit Railway block entity types");
	}
}
