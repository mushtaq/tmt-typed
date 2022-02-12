package tmttyped.std

import tmttyped.std.stdStrings.async
import tmttyped.std.stdStrings.auto
import tmttyped.std.stdStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating <img> elements. */
@js.native
trait HTMLImageElement
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
  
  /** Sets or retrieves a text alternative to the graphic. */
  /* standard DOM */
  var alt: java.lang.String = js.native
  
  /**
    * Specifies the properties of a border drawn around an object.
    * @deprecated
    */
  /* standard DOM */
  var border: java.lang.String = js.native
  
  /** Retrieves whether the object is fully loaded. */
  /* standard DOM */
  val complete: scala.Boolean = js.native
  
  /* standard DOM */
  var crossOrigin: java.lang.String | Null = js.native
  
  /* standard DOM */
  val currentSrc: java.lang.String = js.native
  
  /* standard DOM */
  def decode(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  var decoding: async | sync | auto = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard DOM */
  var height: Double = js.native
  
  /**
    * Sets or retrieves the width of the border to draw around the object.
    * @deprecated
    */
  /* standard DOM */
  var hspace: Double = js.native
  
  /** Sets or retrieves whether the image is a server-side image map. */
  /* standard DOM */
  var isMap: scala.Boolean = js.native
  
  /* standard DOM */
  var loading: java.lang.String = js.native
  
  /**
    * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
    * @deprecated
    */
  /* standard DOM */
  var longDesc: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var lowsrc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    * @deprecated
    */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /** The original height of the image resource before sizing. */
  /* standard DOM */
  val naturalHeight: Double = js.native
  
  /** The original width of the image resource before sizing. */
  /* standard DOM */
  val naturalWidth: Double = js.native
  
  /* standard DOM */
  var referrerPolicy: java.lang.String = js.native
  
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
  
  /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
  /* standard DOM */
  var useMap: java.lang.String = js.native
  
  /**
    * Sets or retrieves the vertical margin for the object.
    * @deprecated
    */
  /* standard DOM */
  var vspace: Double = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard DOM */
  var width: Double = js.native
  
  /* standard DOM */
  val x: Double = js.native
  
  /* standard DOM */
  val y: Double = js.native
}
