package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The HTMLTrackElement */
@js.native
trait HTMLTrackElement
  extends StObject
     with HTMLElement {
  
  /* standard DOM */
  var default: scala.Boolean = js.native
  
  /* standard DOM */
  val ERROR: Double = js.native
  
  /* standard DOM */
  val LOADED: Double = js.native
  
  /* standard DOM */
  val LOADING: Double = js.native
  
  /* standard DOM */
  val NONE: Double = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  var kind: java.lang.String = js.native
  
  /* standard DOM */
  var label: java.lang.String = js.native
  
  /* standard DOM */
  val readyState: Double = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /* standard DOM */
  var srclang: java.lang.String = js.native
  
  /** Returns the TextTrack object corresponding to the text track of the track element. */
  /* standard DOM */
  val track: org.scalajs.dom.TextTrack = js.native
}
