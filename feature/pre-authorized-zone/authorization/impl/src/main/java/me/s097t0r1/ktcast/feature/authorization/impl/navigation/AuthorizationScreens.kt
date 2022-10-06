package me.s097t0r1.ktcast.feature.authorization.impl.navigation

import me.s097t0r1.core.navigation.screen.DialogFragmentScreen
import me.s097t0r1.core.navigation.screen.FragmentScreen
import me.s097t0r1.ktcast.feature.authorization.impl.presentation.dialogs.datepicker.DatePickerDialogFragment
import me.s097t0r1.ktcast.feature.authorization.impl.presentation.lets_you_in.LetsYouInFragment
import me.s097t0r1.ktcast.feature.authorization.impl.presentation.sign_in.SignInFragment
import me.s097t0r1.ktcast.feature.authorization.impl.presentation.sign_up.SignUpFragment

internal fun letsYouIn() = FragmentScreen.create { LetsYouInFragment() }

internal fun signInScreen() = FragmentScreen.create { SignInFragment() }

internal fun signUpScreen() = FragmentScreen.create { SignUpFragment() }

internal fun datePickerDialog() = DialogFragmentScreen.create { DatePickerDialogFragment() }