/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package sdljava.x.swig;

class SWIG_SDLJoystickJNI {
  public final static native int SDL_NumJoysticks();
  public final static native String SDL_JoystickName(int jarg1);
  public final static native long SDL_JoystickOpen(int jarg1);
  public final static native int SDL_JoystickOpened(int jarg1);
  public final static native int SDL_JoystickIndex(long jarg1);
  public final static native int SDL_JoystickNumAxes(long jarg1);
  public final static native int SDL_JoystickNumBalls(long jarg1);
  public final static native int SDL_JoystickNumHats(long jarg1);
  public final static native int SDL_JoystickNumButtons(long jarg1);
  public final static native void SDL_JoystickUpdate();
  public final static native int SDL_JoystickEventState(int jarg1);
  public final static native short SDL_JoystickGetAxis(long jarg1, int jarg2);
  public final static native short SDL_JoystickGetHat(long jarg1, int jarg2);
  public final static native int SDL_JoystickGetBall(long jarg1, int jarg2, int[] jarg3, int[] jarg4);
  public final static native short SDL_JoystickGetButton(long jarg1, int jarg2);
  public final static native void SDL_JoystickClose(long jarg1);
}
