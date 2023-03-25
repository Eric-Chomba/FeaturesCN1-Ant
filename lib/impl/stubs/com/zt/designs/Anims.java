package com.zt.designs;


/**
 * 
 *  @author Eric
 */
public class Anims {

	public Anims() {
	}

	/**
	 *  @param formAnim - Form in which progress animation is added
	 *  @param size - progress bar size
	 *  @param width - progress bar width
	 *  @param bgColor - animation background color
	 *  @param progressColor - progress bar color
	 *  @param direction - progress direction (C - clockwise, A - anticlockwise)
	 *  @param duration - animation duration in miliseconds to determine
	 *  speed(the lower the duration the faster the progress speed)
	 */
	public static void circleProgressBar(com.codename1.ui.Form formAnim, int size, int width, int bgColor, int progressColor, String direction, int duration) {
	}

	protected static com.codename1.ui.Form createCircleProgress(com.codename1.ui.Form formAnim, com.codename1.ui.Form formProgress, int size, int width, int bgColor, int progressColor, String direction, int duration) {
	}

	public static void circleProgressIndicatorBar(com.codename1.ui.Form formAnim, int size, int width, int bgColor, int progressBarColor, int indicatorColor, String direction, int duration) {
	}

	protected static com.codename1.ui.Form circleProgressIndicator(com.codename1.ui.Form formAnim, com.codename1.ui.Form formProgress, int size, int width, int bgColor, int progressBarColor, int indicatorColor, String direction, int duration) {
	}

	public static void clockCircleProgressBar(com.codename1.ui.Form formAnim, int size, int barColor, int indicatorColor, int progressDuration) {
	}

	protected static class CircleClockBars {


		public CircleClockBars(com.codename1.ui.Form formAnim, int size, int barColor, int indicatorColor, int progressDuration) {
		}

		@java.lang.Override
		public com.codename1.ui.geom.Dimension calcPreferredSize() {
		}

		@java.lang.Override
		public void paintBackground(com.codename1.ui.Graphics graphics) {
		}
	}
}
