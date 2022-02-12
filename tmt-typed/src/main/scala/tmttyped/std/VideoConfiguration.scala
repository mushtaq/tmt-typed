package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConfiguration extends StObject {
  
  /* standard DOM */
  var bitrate: Double
  
  /* standard DOM */
  var colorGamut: js.UndefOr[ColorGamut] = js.undefined
  
  /* standard DOM */
  var contentType: java.lang.String
  
  /* standard DOM */
  var framerate: Double
  
  /* standard DOM */
  var hdrMetadataType: js.UndefOr[HdrMetadataType] = js.undefined
  
  /* standard DOM */
  var height: Double
  
  /* standard DOM */
  var scalabilityMode: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var transferFunction: js.UndefOr[TransferFunction] = js.undefined
  
  /* standard DOM */
  var width: Double
}
object VideoConfiguration {
  
  @scala.inline
  def apply(bitrate: Double, contentType: java.lang.String, framerate: Double, height: Double, width: Double): VideoConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoConfiguration]
  }
  
  @scala.inline
  implicit class VideoConfigurationMutableBuilder[Self <: VideoConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGamut(value: ColorGamut): Self = StObject.set(x, "colorGamut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGamutUndefined: Self = StObject.set(x, "colorGamut", js.undefined)
    
    @scala.inline
    def setContentType(value: java.lang.String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdrMetadataType(value: HdrMetadataType): Self = StObject.set(x, "hdrMetadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdrMetadataTypeUndefined: Self = StObject.set(x, "hdrMetadataType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalabilityMode(value: java.lang.String): Self = StObject.set(x, "scalabilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalabilityModeUndefined: Self = StObject.set(x, "scalabilityMode", js.undefined)
    
    @scala.inline
    def setTransferFunction(value: TransferFunction): Self = StObject.set(x, "transferFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferFunctionUndefined: Self = StObject.set(x, "transferFunction", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
