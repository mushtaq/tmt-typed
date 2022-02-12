package tmttyped.std.global

import tmttyped.std.BinaryData
import tmttyped.std.FontFaceDescriptors
import tmttyped.std.FontFaceLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FontFace")
@js.native
class FontFace protected ()
  extends StObject
     with tmttyped.std.FontFace {
  /* standard DOM */
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override var ascentOverride: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var descentOverride: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var display: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var family: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var featureSettings: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var lineGapOverride: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def load(): js.Promise[tmttyped.std.FontFace] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val loaded: js.Promise[tmttyped.std.FontFace] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val status: FontFaceLoadStatus = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var stretch: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var style: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var unicodeRange: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var variant: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var variationSettings: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var weight: java.lang.String = js.native
}
