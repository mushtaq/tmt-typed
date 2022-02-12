package tmttyped.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions extends StObject {
  
  /**
    * Dereference symlinks
    * @default false
    */
  var dereference: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `force` is `false`, and the destination
    * exists, throw an error.
    * @default false
    */
  var errorOnExist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to filter copied files/directories. Return
    * `true` to copy the item, `false` to ignore it.
    */
  var filter: js.UndefOr[js.Function2[/* source */ String, /* destination */ String, Boolean]] = js.undefined
  
  /**
    * Overwrite existing file or directory. _The copy
    * operation will ignore errors if you set this to false and the destination
    * exists. Use the `errorOnExist` option to change this behavior.
    * @default true
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true` timestamps from `src` will
    * be preserved.
    * @default false
    */
  var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy directories recursively.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsMutableBuilder[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
    
    @scala.inline
    def setErrorOnExist(value: Boolean): Self = StObject.set(x, "errorOnExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOnExistUndefined: Self = StObject.set(x, "errorOnExist", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* source */ String, /* destination */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setPreserveTimestamps(value: Boolean): Self = StObject.set(x, "preserveTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveTimestampsUndefined: Self = StObject.set(x, "preserveTimestamps", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
