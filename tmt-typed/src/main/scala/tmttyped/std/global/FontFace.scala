package tmttyped.std.global

import tmttyped.std.BinaryData
import tmttyped.std.FontFaceDescriptors
import tmttyped.std.FontFaceLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FontFace")
@js.native
open class FontFace protected ()
  extends StObject
     with tmttyped.std.FontFace {
  /* standard DOM */
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  
  /* standard DOM */
  /* CompleteClass */
  var ascentOverride: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var descentOverride: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var display: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var family: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var featureSettings: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var lineGapOverride: java.lang.String = js.native
  
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
  var stretch: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var style: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var unicodeRange: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var variant: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var variationSettings: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var weight: java.lang.String = js.native
}
