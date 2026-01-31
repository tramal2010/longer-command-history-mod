package angrtea.lch;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongerCommandHistory implements ModInitializer {
	public static final String MOD_ID = "longer-command-history";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Longer Command History initialized");
	}
}