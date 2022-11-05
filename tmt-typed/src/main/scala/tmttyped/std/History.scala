package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in. */
@js.native
trait History extends StObject {
  
  /* standard DOM */
  def back(): Unit = js.native
  
  /* standard DOM */
  def forward(): Unit = js.native
  
  /* standard DOM */
  def go(): Unit = js.native
  def go(delta: Double): Unit = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  def pushState(data: Any, unused: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def pushState(data: Any, unused: java.lang.String, url: org.scalajs.dom.URL): Unit = js.native
  
  /* standard DOM */
  def replaceState(data: Any, unused: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: java.lang.String): Unit = js.native
  def replaceState(data: Any, unused: java.lang.String, url: org.scalajs.dom.URL): Unit = js.native
  
  /* standard DOM */
  var scrollRestoration: ScrollRestoration = js.native
  
  /* standard DOM */
  val state: Any = js.native
}
