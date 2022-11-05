package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements. */
@js.native
trait HTMLSourceElement
  extends StObject
     with HTMLElement {
  
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
  var height: Double = js.native
  
  /** Gets or sets the intended media type of the media source. */
  /* standard DOM */
  var media: java.lang.String = js.native
  
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
  var sizes: java.lang.String = js.native
  
  /** The address or URL of the a media resource that is to be considered. */
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /* standard DOM */
  var srcset: java.lang.String = js.native
  
  /** Gets or sets the MIME type of a media resource. */
  /* standard DOM */
  var `type`: java.lang.String = js.native
  
  /* standard DOM */
  var width: Double = js.native
}
