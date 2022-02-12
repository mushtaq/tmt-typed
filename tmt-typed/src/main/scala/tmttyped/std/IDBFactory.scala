package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** In the following code snippet, we make a request to open a database, and include handlers for the success and error cases. For a full working example, see our To-do Notifications app (view example live.) */
@js.native
trait IDBFactory extends StObject {
  
  /**
    * Compares two values as keys. Returns -1 if key1 precedes key2, 1 if key2 precedes key1, and 0 if the keys are equal.
    *
    * Throws a "DataError" DOMException if either input is not a valid key.
    */
  /* standard DOM */
  def cmp(first: Any, second: Any): Double = js.native
  
  /* standard DOM */
  def databases(): js.Promise[js.Array[IDBDatabaseInfo]] = js.native
  
  /** Attempts to delete the named database. If the database already exists and there are open connections that don't close in response to a versionchange event, the request will be blocked until all they close. If the request is successful request's result will be null. */
  /* standard DOM */
  def deleteDatabase(name: java.lang.String): org.scalajs.dom.IDBOpenDBRequest[Any] = js.native
  
  /** Attempts to open a connection to the named database with the current version, or 1 if it does not already exist. If the request is successful request's result will be the connection. */
  /* standard DOM */
  def open(name: java.lang.String): org.scalajs.dom.IDBOpenDBRequest[Any] = js.native
  def open(name: java.lang.String, version: Double): org.scalajs.dom.IDBOpenDBRequest[Any] = js.native
}
