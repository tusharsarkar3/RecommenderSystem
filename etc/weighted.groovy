import miniproject.cbf.TFIDFItemScorer
import miniproject.cbf.UserProfileBuilder
import miniproject.cbf.WeightedUserProfileBuilder
import org.lenskit.api.ItemScorer

// the core: use our item scorer
bind ItemScorer to TFIDFItemScorer
// with the basic profile builder
bind UserProfileBuilder to WeightedUserProfileBuilder
