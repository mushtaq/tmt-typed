package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsChannelMod {
  
  @JSImport("diagnostics_channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The class `Channel` represents an individual named channel within the data
    * pipeline. It is use to track subscribers and to publish messages when there
    * are subscribers present. It exists as a separate object to avoid channel
    * lookups at publish time, enabling very fast publish speeds and allowing
    * for heavy use while incurring very minimal cost. Channels are created with {@link channel}, constructing a channel directly
    * with `new Channel(name)` is not supported.
    */
  @JSImport("diagnostics_channel", "Channel")
  @js.native
  class Channel_ protected () extends StObject {
    protected def this(name: java.lang.String) = this()
    
    val hashSubscribers: Boolean = js.native
    
    val name: java.lang.String = js.native
    
    /**
      * Register a message handler to subscribe to this channel. This message handler
      * will be run synchronously whenever a message is published to the channel. Any
      * errors thrown in the message handler will trigger an `'uncaughtException'`.
      *
      * ```js
      * const diagnostics_channel = require('diagnostics_channel');
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * channel.subscribe((message, name) => {
      *   // Received data
      * });
      * ```
      * @param onMessage The handler to receive channel messages
      */
    def subscribe(listener: ChannelListener): Unit = js.native
    
    /**
      * Remove a message handler previously registered to this channel with `channel.subscribe(onMessage)`.
      *
      * ```js
      * const diagnostics_channel = require('diagnostics_channel');
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * function onMessage(message, name) {
      *   // Received data
      * }
      *
      * channel.subscribe(onMessage);
      *
      * channel.unsubscribe(onMessage);
      * ```
      * @param onMessage The previous subscribed handler to remove
      */
    def unsubscribe(listener: ChannelListener): Unit = js.native
  }
  
  /**
    * This is the primary entry-point for anyone wanting to interact with a named
    * channel. It produces a channel object which is optimized to reduce overhead at
    * publish time as much as possible.
    *
    * ```js
    * const diagnostics_channel = require('diagnostics_channel');
    *
    * const channel = diagnostics_channel.channel('my-channel');
    * ```
    * @param name The channel name
    * @return The named channel object
    */
  @scala.inline
  def channel(name: java.lang.String): Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(name.asInstanceOf[js.Any]).asInstanceOf[Channel_]
  
  /**
    * Check if there are active subscribers to the named channel. This is helpful if
    * the message you want to send might be expensive to prepare.
    *
    * This API is optional but helpful when trying to publish messages from very
    * performance-sensitive code.
    *
    * ```js
    * const diagnostics_channel = require('diagnostics_channel');
    *
    * if (diagnostics_channel.hasSubscribers('my-channel')) {
    *   // There are subscribers, prepare and publish message
    * }
    * ```
    * @param name The channel name
    * @return If there are active subscribers
    */
  @scala.inline
  def hasSubscribers(name: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSubscribers")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ChannelListener = js.Function2[/* name */ java.lang.String, /* message */ js.Any, Unit]
}
