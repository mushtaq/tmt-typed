package tmttyped.std.global

import tmttyped.std.MediaImage
import tmttyped.std.MediaMetadataInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaMetadata")
@js.native
/* standard DOM */
class MediaMetadata ()
  extends StObject
     with tmttyped.std.MediaMetadata {
  def this(init: MediaMetadataInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override var album: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var artist: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var artwork: js.Array[MediaImage] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var title: java.lang.String = js.native
}
