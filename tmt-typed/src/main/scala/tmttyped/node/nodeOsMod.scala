package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.anon.`2`
import tmttyped.node.anon.`4`
import tmttyped.node.nodeStrings.BE
import tmttyped.node.nodeStrings.LE
import tmttyped.node.osMod.CpuInfo
import tmttyped.node.osMod.NetworkInterfaceInfo
import tmttyped.node.osMod.SignalConstants
import tmttyped.node.osMod.UserInfo_
import tmttyped.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeOsMod {
  
  @JSImport("node:os", "EOL")
  @js.native
  val EOL: java.lang.String = js.native
  
  @JSImport("node:os", "arch")
  @js.native
  def arch(): java.lang.String = js.native
  
  object constants {
    
    @JSImport("node:os", "constants.UV_UDP_REUSEADDR")
    @js.native
    val UV_UDP_REUSEADDR: Double = js.native
    
    object errno {
      
      @JSImport("node:os", "constants.errno.E2BIG")
      @js.native
      val E2BIG: Double = js.native
      
      @JSImport("node:os", "constants.errno.EACCES")
      @js.native
      val EACCES: Double = js.native
      
      @JSImport("node:os", "constants.errno.EADDRINUSE")
      @js.native
      val EADDRINUSE: Double = js.native
      
      @JSImport("node:os", "constants.errno.EADDRNOTAVAIL")
      @js.native
      val EADDRNOTAVAIL: Double = js.native
      
      @JSImport("node:os", "constants.errno.EAFNOSUPPORT")
      @js.native
      val EAFNOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.EAGAIN")
      @js.native
      val EAGAIN: Double = js.native
      
      @JSImport("node:os", "constants.errno.EALREADY")
      @js.native
      val EALREADY: Double = js.native
      
      @JSImport("node:os", "constants.errno.EBADF")
      @js.native
      val EBADF: Double = js.native
      
      @JSImport("node:os", "constants.errno.EBADMSG")
      @js.native
      val EBADMSG: Double = js.native
      
      @JSImport("node:os", "constants.errno.EBUSY")
      @js.native
      val EBUSY: Double = js.native
      
      @JSImport("node:os", "constants.errno.ECANCELED")
      @js.native
      val ECANCELED: Double = js.native
      
      @JSImport("node:os", "constants.errno.ECHILD")
      @js.native
      val ECHILD: Double = js.native
      
      @JSImport("node:os", "constants.errno.ECONNABORTED")
      @js.native
      val ECONNABORTED: Double = js.native
      
      @JSImport("node:os", "constants.errno.ECONNREFUSED")
      @js.native
      val ECONNREFUSED: Double = js.native
      
      @JSImport("node:os", "constants.errno.ECONNRESET")
      @js.native
      val ECONNRESET: Double = js.native
      
      @JSImport("node:os", "constants.errno.EDEADLK")
      @js.native
      val EDEADLK: Double = js.native
      
      @JSImport("node:os", "constants.errno.EDESTADDRREQ")
      @js.native
      val EDESTADDRREQ: Double = js.native
      
      @JSImport("node:os", "constants.errno.EDOM")
      @js.native
      val EDOM: Double = js.native
      
      @JSImport("node:os", "constants.errno.EDQUOT")
      @js.native
      val EDQUOT: Double = js.native
      
      @JSImport("node:os", "constants.errno.EEXIST")
      @js.native
      val EEXIST: Double = js.native
      
      @JSImport("node:os", "constants.errno.EFAULT")
      @js.native
      val EFAULT: Double = js.native
      
      @JSImport("node:os", "constants.errno.EFBIG")
      @js.native
      val EFBIG: Double = js.native
      
      @JSImport("node:os", "constants.errno.EHOSTUNREACH")
      @js.native
      val EHOSTUNREACH: Double = js.native
      
      @JSImport("node:os", "constants.errno.EIDRM")
      @js.native
      val EIDRM: Double = js.native
      
      @JSImport("node:os", "constants.errno.EILSEQ")
      @js.native
      val EILSEQ: Double = js.native
      
      @JSImport("node:os", "constants.errno.EINPROGRESS")
      @js.native
      val EINPROGRESS: Double = js.native
      
      @JSImport("node:os", "constants.errno.EINTR")
      @js.native
      val EINTR: Double = js.native
      
      @JSImport("node:os", "constants.errno.EINVAL")
      @js.native
      val EINVAL: Double = js.native
      
      @JSImport("node:os", "constants.errno.EIO")
      @js.native
      val EIO: Double = js.native
      
      @JSImport("node:os", "constants.errno.EISCONN")
      @js.native
      val EISCONN: Double = js.native
      
      @JSImport("node:os", "constants.errno.EISDIR")
      @js.native
      val EISDIR: Double = js.native
      
      @JSImport("node:os", "constants.errno.ELOOP")
      @js.native
      val ELOOP: Double = js.native
      
      @JSImport("node:os", "constants.errno.EMFILE")
      @js.native
      val EMFILE: Double = js.native
      
      @JSImport("node:os", "constants.errno.EMLINK")
      @js.native
      val EMLINK: Double = js.native
      
      @JSImport("node:os", "constants.errno.EMSGSIZE")
      @js.native
      val EMSGSIZE: Double = js.native
      
      @JSImport("node:os", "constants.errno.EMULTIHOP")
      @js.native
      val EMULTIHOP: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENAMETOOLONG")
      @js.native
      val ENAMETOOLONG: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENETDOWN")
      @js.native
      val ENETDOWN: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENETRESET")
      @js.native
      val ENETRESET: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENETUNREACH")
      @js.native
      val ENETUNREACH: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENFILE")
      @js.native
      val ENFILE: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOBUFS")
      @js.native
      val ENOBUFS: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENODATA")
      @js.native
      val ENODATA: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENODEV")
      @js.native
      val ENODEV: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOENT")
      @js.native
      val ENOENT: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOEXEC")
      @js.native
      val ENOEXEC: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOLCK")
      @js.native
      val ENOLCK: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOLINK")
      @js.native
      val ENOLINK: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOMEM")
      @js.native
      val ENOMEM: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOMSG")
      @js.native
      val ENOMSG: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOPROTOOPT")
      @js.native
      val ENOPROTOOPT: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOSPC")
      @js.native
      val ENOSPC: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOSR")
      @js.native
      val ENOSR: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOSTR")
      @js.native
      val ENOSTR: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOSYS")
      @js.native
      val ENOSYS: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTCONN")
      @js.native
      val ENOTCONN: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTDIR")
      @js.native
      val ENOTDIR: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTEMPTY")
      @js.native
      val ENOTEMPTY: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTSOCK")
      @js.native
      val ENOTSOCK: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTSUP")
      @js.native
      val ENOTSUP: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENOTTY")
      @js.native
      val ENOTTY: Double = js.native
      
      @JSImport("node:os", "constants.errno.ENXIO")
      @js.native
      val ENXIO: Double = js.native
      
      @JSImport("node:os", "constants.errno.EOPNOTSUPP")
      @js.native
      val EOPNOTSUPP: Double = js.native
      
      @JSImport("node:os", "constants.errno.EOVERFLOW")
      @js.native
      val EOVERFLOW: Double = js.native
      
      @JSImport("node:os", "constants.errno.EPERM")
      @js.native
      val EPERM: Double = js.native
      
      @JSImport("node:os", "constants.errno.EPIPE")
      @js.native
      val EPIPE: Double = js.native
      
      @JSImport("node:os", "constants.errno.EPROTO")
      @js.native
      val EPROTO: Double = js.native
      
      @JSImport("node:os", "constants.errno.EPROTONOSUPPORT")
      @js.native
      val EPROTONOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.EPROTOTYPE")
      @js.native
      val EPROTOTYPE: Double = js.native
      
      @JSImport("node:os", "constants.errno.ERANGE")
      @js.native
      val ERANGE: Double = js.native
      
      @JSImport("node:os", "constants.errno.EROFS")
      @js.native
      val EROFS: Double = js.native
      
      @JSImport("node:os", "constants.errno.ESPIPE")
      @js.native
      val ESPIPE: Double = js.native
      
      @JSImport("node:os", "constants.errno.ESRCH")
      @js.native
      val ESRCH: Double = js.native
      
      @JSImport("node:os", "constants.errno.ESTALE")
      @js.native
      val ESTALE: Double = js.native
      
      @JSImport("node:os", "constants.errno.ETIME")
      @js.native
      val ETIME: Double = js.native
      
      @JSImport("node:os", "constants.errno.ETIMEDOUT")
      @js.native
      val ETIMEDOUT: Double = js.native
      
      @JSImport("node:os", "constants.errno.ETXTBSY")
      @js.native
      val ETXTBSY: Double = js.native
      
      @JSImport("node:os", "constants.errno.EWOULDBLOCK")
      @js.native
      val EWOULDBLOCK: Double = js.native
      
      @JSImport("node:os", "constants.errno.EXDEV")
      @js.native
      val EXDEV: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEACCES")
      @js.native
      val WSAEACCES: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEADDRINUSE")
      @js.native
      val WSAEADDRINUSE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEADDRNOTAVAIL")
      @js.native
      val WSAEADDRNOTAVAIL: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEAFNOSUPPORT")
      @js.native
      val WSAEAFNOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEALREADY")
      @js.native
      val WSAEALREADY: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEBADF")
      @js.native
      val WSAEBADF: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAECANCELLED")
      @js.native
      val WSAECANCELLED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAECONNABORTED")
      @js.native
      val WSAECONNABORTED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAECONNREFUSED")
      @js.native
      val WSAECONNREFUSED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAECONNRESET")
      @js.native
      val WSAECONNRESET: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEDESTADDRREQ")
      @js.native
      val WSAEDESTADDRREQ: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEDISCON")
      @js.native
      val WSAEDISCON: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEDQUOT")
      @js.native
      val WSAEDQUOT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEFAULT")
      @js.native
      val WSAEFAULT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEHOSTDOWN")
      @js.native
      val WSAEHOSTDOWN: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEHOSTUNREACH")
      @js.native
      val WSAEHOSTUNREACH: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEINPROGRESS")
      @js.native
      val WSAEINPROGRESS: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEINTR")
      @js.native
      val WSAEINTR: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEINVAL")
      @js.native
      val WSAEINVAL: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEINVALIDPROCTABLE")
      @js.native
      val WSAEINVALIDPROCTABLE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEINVALIDPROVIDER")
      @js.native
      val WSAEINVALIDPROVIDER: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEISCONN")
      @js.native
      val WSAEISCONN: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAELOOP")
      @js.native
      val WSAELOOP: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEMFILE")
      @js.native
      val WSAEMFILE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEMSGSIZE")
      @js.native
      val WSAEMSGSIZE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENAMETOOLONG")
      @js.native
      val WSAENAMETOOLONG: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENETDOWN")
      @js.native
      val WSAENETDOWN: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENETRESET")
      @js.native
      val WSAENETRESET: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENETUNREACH")
      @js.native
      val WSAENETUNREACH: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOBUFS")
      @js.native
      val WSAENOBUFS: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOMORE")
      @js.native
      val WSAENOMORE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOPROTOOPT")
      @js.native
      val WSAENOPROTOOPT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOTCONN")
      @js.native
      val WSAENOTCONN: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOTEMPTY")
      @js.native
      val WSAENOTEMPTY: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAENOTSOCK")
      @js.native
      val WSAENOTSOCK: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEOPNOTSUPP")
      @js.native
      val WSAEOPNOTSUPP: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEPFNOSUPPORT")
      @js.native
      val WSAEPFNOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEPROCLIM")
      @js.native
      val WSAEPROCLIM: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEPROTONOSUPPORT")
      @js.native
      val WSAEPROTONOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEPROTOTYPE")
      @js.native
      val WSAEPROTOTYPE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEPROVIDERFAILEDINIT")
      @js.native
      val WSAEPROVIDERFAILEDINIT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEREFUSED")
      @js.native
      val WSAEREFUSED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEREMOTE")
      @js.native
      val WSAEREMOTE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAESHUTDOWN")
      @js.native
      val WSAESHUTDOWN: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAESOCKTNOSUPPORT")
      @js.native
      val WSAESOCKTNOSUPPORT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAESTALE")
      @js.native
      val WSAESTALE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAETIMEDOUT")
      @js.native
      val WSAETIMEDOUT: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAETOOMANYREFS")
      @js.native
      val WSAETOOMANYREFS: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEUSERS")
      @js.native
      val WSAEUSERS: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAEWOULDBLOCK")
      @js.native
      val WSAEWOULDBLOCK: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSANOTINITIALISED")
      @js.native
      val WSANOTINITIALISED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSASERVICE_NOT_FOUND")
      @js.native
      val WSASERVICE_NOT_FOUND: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSASYSCALLFAILURE")
      @js.native
      val WSASYSCALLFAILURE: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSASYSNOTREADY")
      @js.native
      val WSASYSNOTREADY: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSATYPE_NOT_FOUND")
      @js.native
      val WSATYPE_NOT_FOUND: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSAVERNOTSUPPORTED")
      @js.native
      val WSAVERNOTSUPPORTED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSA_E_CANCELLED")
      @js.native
      val WSA_E_CANCELLED: Double = js.native
      
      @JSImport("node:os", "constants.errno.WSA_E_NO_MORE")
      @js.native
      val WSA_E_NO_MORE: Double = js.native
    }
    
    object priority {
      
      @JSImport("node:os", "constants.priority.PRIORITY_ABOVE_NORMAL")
      @js.native
      val PRIORITY_ABOVE_NORMAL: Double = js.native
      
      @JSImport("node:os", "constants.priority.PRIORITY_BELOW_NORMAL")
      @js.native
      val PRIORITY_BELOW_NORMAL: Double = js.native
      
      @JSImport("node:os", "constants.priority.PRIORITY_HIGH")
      @js.native
      val PRIORITY_HIGH: Double = js.native
      
      @JSImport("node:os", "constants.priority.PRIORITY_HIGHEST")
      @js.native
      val PRIORITY_HIGHEST: Double = js.native
      
      @JSImport("node:os", "constants.priority.PRIORITY_LOW")
      @js.native
      val PRIORITY_LOW: Double = js.native
      
      @JSImport("node:os", "constants.priority.PRIORITY_NORMAL")
      @js.native
      val PRIORITY_NORMAL: Double = js.native
    }
    
    @JSImport("node:os", "constants.signals")
    @js.native
    val signals: SignalConstants = js.native
  }
  
  @JSImport("node:os", "cpus")
  @js.native
  def cpus(): js.Array[CpuInfo] = js.native
  
  @JSImport("node:os", "endianness")
  @js.native
  def endianness(): BE | LE = js.native
  
  @JSImport("node:os", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  @JSImport("node:os", "getPriority")
  @js.native
  def getPriority(): Double = js.native
  @JSImport("node:os", "getPriority")
  @js.native
  def getPriority(pid: Double): Double = js.native
  
  @JSImport("node:os", "homedir")
  @js.native
  def homedir(): java.lang.String = js.native
  
  @JSImport("node:os", "hostname")
  @js.native
  def hostname(): java.lang.String = js.native
  
  @JSImport("node:os", "loadavg")
  @js.native
  def loadavg(): js.Array[Double] = js.native
  
  @JSImport("node:os", "networkInterfaces")
  @js.native
  def networkInterfaces(): Dict[js.Array[NetworkInterfaceInfo]] = js.native
  
  @JSImport("node:os", "platform")
  @js.native
  def platform(): Platform = js.native
  
  @JSImport("node:os", "release")
  @js.native
  def release(): java.lang.String = js.native
  
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  @JSImport("node:os", "setPriority")
  @js.native
  def setPriority(pid: Double, priority: Double): Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  @JSImport("node:os", "setPriority")
  @js.native
  def setPriority(priority: Double): Unit = js.native
  
  @JSImport("node:os", "tmpdir")
  @js.native
  def tmpdir(): java.lang.String = js.native
  
  @JSImport("node:os", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
  @JSImport("node:os", "uptime")
  @js.native
  def uptime(): Double = js.native
  
  @JSImport("node:os", "userInfo")
  @js.native
  def userInfo(): UserInfo_[java.lang.String] = js.native
  @JSImport("node:os", "userInfo")
  @js.native
  def userInfo(options: `2`): UserInfo_[Buffer] = js.native
  @JSImport("node:os", "userInfo")
  @js.native
  def userInfo(options: `4`): UserInfo_[java.lang.String] = js.native
  
  /**
    * Returns a string identifying the kernel version.
    * On POSIX systems, the operating system release is determined by calling
    * [uname(3)][]. On Windows, `pRtlGetVersion` is used, and if it is not available,
    * `GetVersionExW()` will be used. See
    * https://en.wikipedia.org/wiki/Uname#Examples for more information.
    */
  @JSImport("node:os", "version")
  @js.native
  def version(): java.lang.String = js.native
  
  @JSImport("node:os", "type")
  @js.native
  def `type`(): java.lang.String = js.native
}
