package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The location (URL) of the object it is linked to. Changes done on it are reflected on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via Document.location and Window.location respectively. */
@js.native
trait Location extends StObject {
  
  /** Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing context to the top-level browsing context. */
  /* standard DOM */
  val ancestorOrigins: org.scalajs.dom.DOMStringList = js.native
  
  /** Navigates to the given URL. */
  /* standard DOM */
  def assign(url: java.lang.String): Unit = js.native
  def assign(url: org.scalajs.dom.URL): Unit = js.native
  
  /**
    * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
    *
    * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
    */
  /* standard DOM */
  var hash: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's host and port (if different from the default port for the scheme).
    *
    * Can be set, to navigate to the same URL with a changed host and port.
    */
  /* standard DOM */
  var host: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's host.
    *
    * Can be set, to navigate to the same URL with a changed host.
    */
  /* standard DOM */
  var hostname: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL.
    *
    * Can be set, to navigate to the given URL.
    */
  /* standard DOM */
  var href: java.lang.String = js.native
  
  /** Returns the Location object's URL's origin. */
  /* standard DOM */
  val origin: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's path.
    *
    * Can be set, to navigate to the same URL with a changed path.
    */
  /* standard DOM */
  var pathname: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's port.
    *
    * Can be set, to navigate to the same URL with a changed port.
    */
  /* standard DOM */
  var port: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's scheme.
    *
    * Can be set, to navigate to the same URL with a changed scheme.
    */
  /* standard DOM */
  var protocol: java.lang.String = js.native
  
  /** Reloads the current page. */
  /* standard DOM */
  def reload(): Unit = js.native
  
  /** Removes the current page from the session history and navigates to the given URL. */
  /* standard DOM */
  def replace(url: java.lang.String): Unit = js.native
  def replace(url: org.scalajs.dom.URL): Unit = js.native
  
  /**
    * Returns the Location object's URL's query (includes leading "?" if non-empty).
    *
    * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
    */
  /* standard DOM */
  var search: java.lang.String = js.native
}
