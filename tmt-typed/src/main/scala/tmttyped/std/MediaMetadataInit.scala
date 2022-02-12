package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaMetadataInit extends StObject {
  
  /* standard DOM */
  var album: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var artist: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var artwork: js.UndefOr[js.Array[MediaImage]] = js.undefined
  
  /* standard DOM */
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object MediaMetadataInit {
  
  @scala.inline
  def apply(): MediaMetadataInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaMetadataInit]
  }
  
  @scala.inline
  implicit class MediaMetadataInitMutableBuilder[Self <: MediaMetadataInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: java.lang.String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setArtist(value: java.lang.String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setArtwork(value: js.Array[MediaImage]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    @scala.inline
    def setArtworkVarargs(value: MediaImage*): Self = StObject.set(x, "artwork", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
