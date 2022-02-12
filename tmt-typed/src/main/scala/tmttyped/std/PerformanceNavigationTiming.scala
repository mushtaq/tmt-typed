package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
trait PerformanceNavigationTiming
  extends StObject
     with PerformanceResourceTiming {
  
  /* standard DOM */
  val domComplete: DOMHighResTimeStamp
  
  /* standard DOM */
  val domContentLoadedEventEnd: DOMHighResTimeStamp
  
  /* standard DOM */
  val domContentLoadedEventStart: DOMHighResTimeStamp
  
  /* standard DOM */
  val domInteractive: DOMHighResTimeStamp
  
  /* standard DOM */
  val loadEventEnd: DOMHighResTimeStamp
  
  /* standard DOM */
  val loadEventStart: DOMHighResTimeStamp
  
  /* standard DOM */
  val redirectCount: Double
  
  /* standard DOM */
  val `type`: NavigationType
  
  /* standard DOM */
  val unloadEventEnd: DOMHighResTimeStamp
  
  /* standard DOM */
  val unloadEventStart: DOMHighResTimeStamp
}
object PerformanceNavigationTiming {
  
  @scala.inline
  def apply(
    connectEnd: DOMHighResTimeStamp,
    connectStart: DOMHighResTimeStamp,
    decodedBodySize: Double,
    domComplete: DOMHighResTimeStamp,
    domContentLoadedEventEnd: DOMHighResTimeStamp,
    domContentLoadedEventStart: DOMHighResTimeStamp,
    domInteractive: DOMHighResTimeStamp,
    domainLookupEnd: DOMHighResTimeStamp,
    domainLookupStart: DOMHighResTimeStamp,
    duration: DOMHighResTimeStamp,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: DOMHighResTimeStamp,
    initiatorType: java.lang.String,
    loadEventEnd: DOMHighResTimeStamp,
    loadEventStart: DOMHighResTimeStamp,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectCount: Double,
    redirectEnd: DOMHighResTimeStamp,
    redirectStart: DOMHighResTimeStamp,
    requestStart: DOMHighResTimeStamp,
    responseEnd: DOMHighResTimeStamp,
    responseStart: DOMHighResTimeStamp,
    secureConnectionStart: DOMHighResTimeStamp,
    serverTiming: js.Array[PerformanceServerTiming],
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any,
    transferSize: Double,
    `type`: NavigationType,
    unloadEventEnd: DOMHighResTimeStamp,
    unloadEventStart: DOMHighResTimeStamp,
    workerStart: DOMHighResTimeStamp
  ): PerformanceNavigationTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], serverTiming = serverTiming.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigationTiming]
  }
  
  @scala.inline
  implicit class PerformanceNavigationTimingMutableBuilder[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomComplete(value: DOMHighResTimeStamp): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomInteractive(value: DOMHighResTimeStamp): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NavigationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
  }
}
