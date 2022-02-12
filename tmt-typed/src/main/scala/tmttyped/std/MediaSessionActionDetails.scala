package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSessionActionDetails extends StObject {
  
  /* standard DOM */
  var action: MediaSessionAction
  
  /* standard DOM */
  var fastSeek: js.UndefOr[scala.Boolean | Null] = js.undefined
  
  /* standard DOM */
  var seekOffset: js.UndefOr[Double | Null] = js.undefined
  
  /* standard DOM */
  var seekTime: js.UndefOr[Double | Null] = js.undefined
}
object MediaSessionActionDetails {
  
  @scala.inline
  def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  @scala.inline
  implicit class MediaSessionActionDetailsMutableBuilder[Self <: MediaSessionActionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSeek(value: scala.Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSeekNull: Self = StObject.set(x, "fastSeek", null)
    
    @scala.inline
    def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
    
    @scala.inline
    def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekOffsetNull: Self = StObject.set(x, "seekOffset", null)
    
    @scala.inline
    def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
    
    @scala.inline
    def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTimeNull: Self = StObject.set(x, "seekTime", null)
    
    @scala.inline
    def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
  }
}
