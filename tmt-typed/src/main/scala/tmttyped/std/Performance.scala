package tmttyped.std

import tmttyped.std.stdStrings.resourcetimingbufferfull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API. */
@js.native
trait Performance
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def clearMarks(): Unit = js.native
  def clearMarks(markName: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def clearMeasures(): Unit = js.native
  def clearMeasures(measureName: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def clearResourceTimings(): Unit = js.native
  
  /* standard DOM */
  val eventCounts: EventCounts = js.native
  
  /* standard DOM */
  def getEntries(): PerformanceEntryList = js.native
  
  /* standard DOM */
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard DOM */
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard DOM */
  def mark(markName: java.lang.String): org.scalajs.dom.PerformanceMark = js.native
  def mark(markName: java.lang.String, markOptions: PerformanceMarkOptions): org.scalajs.dom.PerformanceMark = js.native
  
  /* standard DOM */
  def measure(measureName: java.lang.String): org.scalajs.dom.PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String): org.scalajs.dom.PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String, endMark: java.lang.String): org.scalajs.dom.PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: Unit, endMark: java.lang.String): org.scalajs.dom.PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: PerformanceMeasureOptions): org.scalajs.dom.PerformanceMeasure = js.native
  def measure(
    measureName: java.lang.String,
    startOrMeasureOptions: PerformanceMeasureOptions,
    endMark: java.lang.String
  ): org.scalajs.dom.PerformanceMeasure = js.native
  
  /** @deprecated */
  /* standard DOM */
  val navigation: org.scalajs.dom.PerformanceNavigation = js.native
  
  /* standard DOM */
  def now(): DOMHighResTimeStamp = js.native
  
  /* standard DOM */
  var onresourcetimingbufferfull: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def setResourceTimingBufferSize(maxSize: Double): Unit = js.native
  
  /* standard DOM */
  val timeOrigin: DOMHighResTimeStamp = js.native
  
  /** @deprecated */
  /* standard DOM */
  val timing: org.scalajs.dom.PerformanceTiming = js.native
  
  /* standard DOM */
  def toJSON(): Any = js.native
}
