package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The storage for Cache objects.
  * Available only in secure contexts.
  */
@js.native
trait CacheStorage extends StObject {
  
  /* standard DOM */
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  
  def `match`(request: org.scalajs.dom.URL): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: org.scalajs.dom.URL, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  /* standard DOM */
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  def `match`(request: RequestInfo, options: MultiCacheQueryOptions): js.Promise[js.UndefOr[org.scalajs.dom.Response]] = js.native
  
  /* standard DOM */
  def open(cacheName: java.lang.String): js.Promise[org.scalajs.dom.Cache] = js.native
}
