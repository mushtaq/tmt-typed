package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGZoomAndPan extends StObject {
  
  val SVG_ZOOMANDPAN_DISABLE: Double
  
  val SVG_ZOOMANDPAN_MAGNIFY: Double
  
  val SVG_ZOOMANDPAN_UNKNOWN: Double
  
  var zoomAndPan: Double
}
object SVGZoomAndPan {
  
  @scala.inline
  def apply(
    SVG_ZOOMANDPAN_DISABLE: Double,
    SVG_ZOOMANDPAN_MAGNIFY: Double,
    SVG_ZOOMANDPAN_UNKNOWN: Double,
    zoomAndPan: Double
  ): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(SVG_ZOOMANDPAN_DISABLE = SVG_ZOOMANDPAN_DISABLE.asInstanceOf[js.Any], SVG_ZOOMANDPAN_MAGNIFY = SVG_ZOOMANDPAN_MAGNIFY.asInstanceOf[js.Any], SVG_ZOOMANDPAN_UNKNOWN = SVG_ZOOMANDPAN_UNKNOWN.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
  
  @scala.inline
  implicit class SVGZoomAndPanMutableBuilder[Self <: SVGZoomAndPan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSVG_ZOOMANDPAN_DISABLE(value: Double): Self = StObject.set(x, "SVG_ZOOMANDPAN_DISABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ZOOMANDPAN_MAGNIFY(value: Double): Self = StObject.set(x, "SVG_ZOOMANDPAN_MAGNIFY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ZOOMANDPAN_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_ZOOMANDPAN_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
