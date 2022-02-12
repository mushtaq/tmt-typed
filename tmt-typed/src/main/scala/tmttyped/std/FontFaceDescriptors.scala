package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceDescriptors extends StObject {
  
  /* standard DOM */
  var display: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var featureSettings: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var stretch: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var style: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var variant: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var weight: js.UndefOr[java.lang.String] = js.undefined
}
object FontFaceDescriptors {
  
  @scala.inline
  def apply(): FontFaceDescriptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceDescriptors]
  }
  
  @scala.inline
  implicit class FontFaceDescriptorsMutableBuilder[Self <: FontFaceDescriptors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: java.lang.String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFeatureSettings(value: java.lang.String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
    
    @scala.inline
    def setStretch(value: java.lang.String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: java.lang.String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    @scala.inline
    def setVariant(value: java.lang.String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    @scala.inline
    def setWeight(value: java.lang.String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
