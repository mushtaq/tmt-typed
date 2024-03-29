package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating <hr> elements. */
@js.native
trait HTMLHRElement
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
  
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    * @deprecated
    */
  /* standard DOM */
  var align: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var color: java.lang.String = js.native
  
  /**
    * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
    * @deprecated
    */
  /* standard DOM */
  var noShade: scala.Boolean = js.native
  
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
  
  /** @deprecated */
  /* standard DOM */
  var size: java.lang.String = js.native
  
  /**
    * Sets or retrieves the width of the object.
    * @deprecated
    */
  /* standard DOM */
  var width: java.lang.String = js.native
}
