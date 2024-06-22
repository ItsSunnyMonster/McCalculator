package co.sunnymonster.mccalculator.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class McCalculatorClient implements ClientModInitializer {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("McCalculator initializing!");
    }
}
