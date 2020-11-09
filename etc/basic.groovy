import miniproject.cbf.TFIDFItemScorer
import miniproject.cbf.ThresholdUserProfileBuilder
import miniproject.cbf.UserProfileBuilder
import org.lenskit.api.ItemScorer

// the core: use our item scorer
bind ItemScorer to TFIDFItemScorer
// with the basic profile builder
bind UserProfileBuilder to ThresholdUserProfileBuilder
