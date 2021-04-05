package tmttyped.node

import tmttyped.node.asyncHooksMod.AsyncHook
import tmttyped.node.asyncHooksMod.AsyncResourceOptions
import tmttyped.node.asyncHooksMod.HookCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeAsyncHooksMod {
  
  @JSImport("node:async_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * When having multiple instances of `AsyncLocalStorage`, they are independent
    * from each other. It is safe to instantiate this class multiple times.
    */
  @JSImport("node:async_hooks", "AsyncLocalStorage")
  @js.native
  class AsyncLocalStorage[T] ()
    extends tmttyped.node.asyncHooksMod.AsyncLocalStorage[T]
  
  /**
    * The class AsyncResource was designed to be extended by the embedder's async resources.
    * Using this users can easily trigger the lifetime events of their own resources.
    */
  @JSImport("node:async_hooks", "AsyncResource")
  @js.native
  class AsyncResource protected ()
    extends tmttyped.node.asyncHooksMod.AsyncResource {
    /**
      * AsyncResource() is meant to be extended. Instantiating a
      * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
      * async_hook.executionAsyncId() is used.
      * @param type The type of async event.
      * @param triggerAsyncId The ID of the execution context that created
      *   this async event (default: `executionAsyncId()`), or an
      *   AsyncResourceOptions object (since 9.3)
      */
    def this(`type`: java.lang.String) = this()
    def this(`type`: java.lang.String, triggerAsyncId: Double) = this()
    def this(`type`: java.lang.String, triggerAsyncId: AsyncResourceOptions) = this()
  }
  object AsyncResource {
    
    @JSImport("node:async_hooks", "AsyncResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binds the given function to the current execution context.
      * @param fn The function to bind to the current execution context.
      * @param type An optional name to associate with the underlying `AsyncResource`.
      */
    /* static member */
    @scala.inline
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func with tmttyped.node.anon.AsyncResource = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[Func with tmttyped.node.anon.AsyncResource]
    @scala.inline
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func, `type`: java.lang.String): Func with tmttyped.node.anon.AsyncResource = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Func with tmttyped.node.anon.AsyncResource]
  }
  
  /**
    * Registers functions to be called for different lifetime events of each async operation.
    * @param options the callbacks to register
    * @return an AsyncHooks instance used for disabling and enabling hooks
    */
  @scala.inline
  def createHook(options: HookCallbacks): AsyncHook = ^.asInstanceOf[js.Dynamic].applyDynamic("createHook")(options.asInstanceOf[js.Any]).asInstanceOf[AsyncHook]
  
  /**
    * Returns the asyncId of the current execution context.
    */
  @scala.inline
  def executionAsyncId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("executionAsyncId")().asInstanceOf[Double]
  
  /**
    * The resource representing the current execution.
    *  Useful to store data within the resource.
    *
    * Resource objects returned by `executionAsyncResource()` are most often internal
    * Node.js handle objects with undocumented APIs. Using any functions or properties
    * on the object is likely to crash your application and should be avoided.
    *
    * Using `executionAsyncResource()` in the top-level execution context will
    * return an empty object as there is no handle or request object to use,
    * but having an object representing the top-level can be helpful.
    */
  @scala.inline
  def executionAsyncResource(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("executionAsyncResource")().asInstanceOf[js.Object]
  
  /**
    * Returns the ID of the resource responsible for calling the callback that is currently being executed.
    */
  @scala.inline
  def triggerAsyncId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAsyncId")().asInstanceOf[Double]
}
