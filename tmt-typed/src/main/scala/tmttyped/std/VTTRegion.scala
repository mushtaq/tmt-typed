package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VTTRegion extends StObject {
  
  /* standard DOM */
  var id: java.lang.String
  
  /* standard DOM */
  var lines: Double
  
  /* standard DOM */
  var regionAnchorX: Double
  
  /* standard DOM */
  var regionAnchorY: Double
  
  /* standard DOM */
  var scroll: ScrollSetting
  
  /* standard DOM */
  var viewportAnchorX: Double
  
  /* standard DOM */
  var viewportAnchorY: Double
  
  /* standard DOM */
  var width: Double
}
object VTTRegion {
  
  inline def apply(
    id: java.lang.String,
    lines: Double,
    regionAnchorX: Double,
    regionAnchorY: Double,
    scroll: ScrollSetting,
    viewportAnchorX: Double,
    viewportAnchorY: Double,
    width: Double
  ): VTTRegion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], regionAnchorX = regionAnchorX.asInstanceOf[js.Any], regionAnchorY = regionAnchorY.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], viewportAnchorX = viewportAnchorX.asInstanceOf[js.Any], viewportAnchorY = viewportAnchorY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTTRegion]
  }
  
  extension [Self <: VTTRegion](x: Self) {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setRegionAnchorX(value: Double): Self = StObject.set(x, "regionAnchorX", value.asInstanceOf[js.Any])
    
    inline def setRegionAnchorY(value: Double): Self = StObject.set(x, "regionAnchorY", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: ScrollSetting): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setViewportAnchorX(value: Double): Self = StObject.set(x, "viewportAnchorX", value.asInstanceOf[js.Any])
    
    inline def setViewportAnchorY(value: Double): Self = StObject.set(x, "viewportAnchorY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
