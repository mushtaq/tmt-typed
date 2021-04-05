package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object childProcessMod {
  
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def exec(command: java.lang.String): tmttyped.node.childProcessMod.ChildProcess = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  @scala.inline
  def exec(command: java.lang.String, options: tmttyped.node.anon.encodingBufferEncodingExe): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: tmttyped.node.anon.encodingBufferEncodingExe,
    callback: js.Function3[
      tmttyped.node.childProcessMod.ExecException | scala.Null, 
      tmttyped.node.Buffer | (/* stdout */ java.lang.String), 
      tmttyped.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: tmttyped.node.anon.encodingbuffernullExecOpt): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: tmttyped.node.anon.encodingbuffernullExecOpt,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ tmttyped.node.Buffer, 
      /* stderr */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(command: java.lang.String, options: tmttyped.node.childProcessMod.ExecOptions): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def exec(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  @scala.inline
  def execFile(file: java.lang.String): tmttyped.node.childProcessMod.ChildProcess = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      tmttyped.node.Buffer | (/* stdout */ java.lang.String), 
      tmttyped.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: scala.Null,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ tmttyped.node.Buffer, 
      /* stderr */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: scala.Null,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ tmttyped.node.Buffer, 
      /* stderr */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    callback: js.Function3[
      tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      tmttyped.node.Buffer | (/* stdout */ java.lang.String), 
      tmttyped.node.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: scala.Null,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ tmttyped.node.Buffer, 
      /* stderr */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // no `options` definitely means stdout/stderr are `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.fsMod.BaseEncodingOptions with tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ tmttyped.node.Buffer, 
      /* stderr */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String | tmttyped.node.Buffer, 
      /* stderr */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def execFile(
    file: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ tmttyped.node.childProcessMod.ExecFileException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  
  @scala.inline
  def execFileSync(command: java.lang.String): tmttyped.node.Buffer = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptions
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptions
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync(command: java.lang.String, options: tmttyped.node.childProcessMod.ExecFileSyncOptions): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execFileSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execFileSync_String(command: java.lang.String): java.lang.String = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execSync(command: java.lang.String): tmttyped.node.Buffer = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execSync(command: java.lang.String, options: tmttyped.node.childProcessMod.ExecSyncOptions): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
  ): tmttyped.node.Buffer = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def execSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def execSync_String(command: java.lang.String): java.lang.String = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def fork(modulePath: java.lang.String): tmttyped.node.childProcessMod.ChildProcess = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(
    modulePath: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.ForkOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.ForkOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def fork(modulePath: java.lang.String, options: tmttyped.node.childProcessMod.ForkOptions): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  
  // overloads of spawn without 'args'
  // overloads of spawn with 'args'
  @scala.inline
  def spawn(command: java.lang.String): tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.SpawnOptionsWithoutStdio
  ): tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnOptions
  ): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnOptionsWithStdioTuple[
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe, 
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe, 
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe
    ]
  ): tmttyped.node.childProcessMod.ChildProcessByStdio[
    tmttyped.node.nodeStreamMod.Writable, 
    tmttyped.node.nodeStreamMod.Readable, 
    tmttyped.node.nodeStreamMod.Readable
  ] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessByStdio[
    tmttyped.node.nodeStreamMod.Writable, 
    tmttyped.node.nodeStreamMod.Readable, 
    tmttyped.node.nodeStreamMod.Readable
  ]]
  @scala.inline
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnOptionsWithoutStdio
  ): tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams]
  @scala.inline
  def spawn(command: java.lang.String, options: tmttyped.node.childProcessMod.SpawnOptions): tmttyped.node.childProcessMod.ChildProcess = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcess]
  @scala.inline
  def spawn(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.SpawnOptionsWithStdioTuple[
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe, 
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe, 
      tmttyped.node.childProcessMod.StdioNull | tmttyped.node.childProcessMod.StdioPipe
    ]
  ): tmttyped.node.childProcessMod.ChildProcessByStdio[
    tmttyped.node.nodeStreamMod.Writable, 
    tmttyped.node.nodeStreamMod.Readable, 
    tmttyped.node.nodeStreamMod.Readable
  ] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessByStdio[
    tmttyped.node.nodeStreamMod.Writable, 
    tmttyped.node.nodeStreamMod.Readable, 
    tmttyped.node.nodeStreamMod.Readable
  ]]
  @scala.inline
  def spawn(command: java.lang.String, options: tmttyped.node.childProcessMod.SpawnOptionsWithoutStdio): tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.ChildProcessWithoutNullStreams]
  
  @scala.inline
  def spawnSync(command: java.lang.String): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.SpawnSyncOptions
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnSyncOptions
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  @scala.inline
  def spawnSync(command: java.lang.String, options: tmttyped.node.childProcessMod.SpawnSyncOptions): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[tmttyped.node.Buffer]]
  @scala.inline
  def spawnSync(
    command: java.lang.String,
    options: tmttyped.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
  ): tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (tmttyped.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
  
  type ExecFileException = tmttyped.node.childProcessMod.ExecException with tmttyped.node.NodeJS.ErrnoException
  
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeStrings.pipe
    - tmttyped.node.nodeStrings.ignore
    - tmttyped.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    tmttyped.node.nodeStrings.pipe | tmttyped.node.nodeStrings.ipc | tmttyped.node.nodeStrings.ignore | tmttyped.node.nodeStrings.inherit | tmttyped.node.nodeStreamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = tmttyped.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      tmttyped.node.nodeStrings.pipe | tmttyped.node.nodeStrings.ipc | tmttyped.node.nodeStrings.ignore | tmttyped.node.nodeStrings.inherit | tmttyped.node.nodeStreamMod.Stream | scala.Double | scala.Null
    ]
  ])
  
  type StdioPipe = js.UndefOr[scala.Null | tmttyped.node.nodeStrings.pipe]
}
