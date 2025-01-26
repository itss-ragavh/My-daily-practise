import java.util.Scanner;
class  Swiggy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\n\t\t\tWelcome to swiggy");
		System.out.println("\t1.Buhari\n\t2.A2B\n\t3.Amma Hotel");
		System.out.print("Select the hotel[1-3]  :");
		int Sel_hotel=sc.nextInt();
		switch (Sel_hotel)
		{
		 case 1:
			{
			System.out.println("\n\t\t\t\tWelcome to Bhurai");
			System.out.println("\n\t\tselect the menu");
			System.out.println("\t1.Mutton Briyani\n\t2.Chicken Briyani\n\t3.Chicken-65");
			System.out.print("\nEnter your food(1-3)  :");
			int sel_bhufood=sc.nextInt();
			switch (sel_bhufood)
			{
			case 1:
				{
					System.out.println("The selected food is mutton biryani");
					double mb_price=320;
					System.out.println("The price of mutton briyani is \t"+mb_price);
					System.out.print("Enter the Quantity :");
					int Qty=sc.nextInt();
					double sys_bill=mb_price*Qty;
					System.out.println("The total amount is " +sys_bill);
					System.out.println("Enter your total bill amount");
					double user_bill=sc.nextDouble();
					if (user_bill==sys_bill)
					{
						System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
						System.out.print("Enter your payment method :");
						int pay_mth=sc.nextInt();
						switch (pay_mth)
						{
						 case 1:
							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
						 case 2:

							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
						 default:
							{
							 
								System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
								break;
							}						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
					
					break;
				}
			 case 2:
				{
					System.out.println("The selected food is Chicken biryani");
					double cb_price=200;
					System.out.println("The price of chicken briyani is \t"+cb_price);
					System.out.print("Enter the Quantity  :");
					int Qty=sc.nextInt();
					double sys_bill=cb_price*Qty;
					System.out.println("The total amount is " +sys_bill);
					System.out.print("Enter your total bill amount  :");
					double user_bill=sc.nextDouble();
					if (user_bill==sys_bill)
					{
						System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
						System.out.print("Enter your payment method :");
						int pay_mth=sc.nextInt();
						switch (pay_mth)
						{
						case 1:
							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
						case 2:

							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
						default:
							{
								System.out.println("Order canceled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
					
					break;
				}
			 case 3:
				{
					System.out.println("The selected food is Chicken 65");
					double c65_price=50;
					System.out.println("The price of 'Chicken-65' is " +c65_price+ " per 100g"); 
					System.out.print("Enter the Quantity  :");
					int Qty=sc.nextInt();
					double sys_bill=c65_price*Qty;
					System.out.println("The total amount is " +sys_bill);
					System.out.print("Enter your total bill amount  :");
					double user_bill=sc.nextDouble();
					if (user_bill==sys_bill)
					{
						System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
						System.out.print("Enter your payment method :");
						int pay_mth=sc.nextInt();
						switch (pay_mth)
						{
						case 1:
							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
						case 2:

							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Buhari Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
						default:
							{
								System.out.println("Order canceled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
					

					break;
				}
			 default:
				{
					System.out.println("Enter the valid menu");
					break;
				}
			}
			break;
			}
		 case 2:
			{
					System.out.println("\t\t\t\tWelcome to A2B");
					System.out.println("\t\tselect the menu");
					System.out.println("\t1.Pongal\n\t2.Mushroom briyani\n\t3.Dosai!!");
					System.out.print("Enter your food(1-3)  :");
					int sel_a2bfood=sc.nextInt();
					switch (sel_a2bfood)
					{
					case 1:
						{
							System.out.println("heyy!!-- you selected 'Pongal'");
							System.out.println("We do have diffrent types of pongal");
							System.out.println("\t1.Ghee-Pongal\n\t2.Millagu-Pongal");
							System.out.print("\t\tEnter the Pongal as you wish :");
							int pg_type=sc.nextInt();
							switch (pg_type)
							{
							case 1:
								{
									System.out.println("You selected Ghee-Pongal\nOur SIGNATURE DISH");
									double Gpgl_price=150;
									System.out.println("The price of Ghee-Pongal-1Qty(250g) is"+Gpgl_price);
									System.out.print("Enter the Quantity  :");
									int Qty=sc.nextInt();
									double sys_bill=Gpgl_price*Qty;
									System.out.println("The total amount is " +sys_bill);
									System.out.print("Enter your total bill amount  :");
									double user_bill=sc.nextDouble();
									if (user_bill==sys_bill)
									{
										System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
										System.out.print("Enter your payment method  :");
										int pay_mth=sc.nextInt();
										switch (pay_mth)
										{
											case 1:
											{
												System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
												int gen_otp=(int)(Math.random()*9999+9999);
												System.out.println(gen_otp);
												System.out.print("Enter the otp  :");
												int user_otp=sc.nextInt();
												if (user_otp==gen_otp)
												{
													System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
													System.out.println("Payment done by using 'G-pay' ");
												}
												else
												{
													System.out.println("The order is failed[wrong OTP Entered]");
												}
											break;
											}
											case 2:

											{
												System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
												int gen_otp=(int)(Math.random()*9999+9999);
												System.out.println(gen_otp);
												System.out.print("Enter the otp  :");
												int user_otp=sc.nextInt();
												if (user_otp==gen_otp)
												{
													System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
													System.out.println("Payment done by using 'Phonepay' ");
												}	
												else
												{
													System.out.println("The order is failed[Wrong OTP Entered ]");
												}	
												break;
											}
											default:
											{
												System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
												break;}						
						
											}
									}
									else
									{
										System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
									}
									break;
								}
							 case 2:
								{
									System.out.println("You selected Millagu-Pongal\nIts good for cold");
									double Mpgl_price=160;
									System.out.println("The price of Milagu-Pongal-1Qty(250g) is"+Mpgl_price);
									System.out.print("Enter the Quantity  :");
									int Qty=sc.nextInt();
									double sys_bill=Mpgl_price*Qty;
									System.out.println("The total amount is " +sys_bill);
									System.out.print("Enter your total bill amount  :");
									double user_bill=sc.nextDouble();
									if (user_bill==sys_bill)
									{
										System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
										System.out.print("Enter your payment method  :");
										int pay_mth=sc.nextInt();
										switch (pay_mth)
										{
											case 1:
											{
												System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
												int gen_otp=(int)(Math.random()*9999+9999);
												System.out.println(gen_otp);
												System.out.print("Enter the otp  :");
												int user_otp=sc.nextInt();
												if (user_otp==gen_otp)
												{
													System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
													System.out.println("Payment done by using 'G-pay' ");
												}
												else
												{
													System.out.println("The order is failed[wrong OTP Entered]");
												}
											break;
											}
											case 2:

											{
												System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
												int gen_otp=(int)(Math.random()*9999+9999);
												System.out.println(gen_otp);
												System.out.print("Enter the otp  :");
												int user_otp=sc.nextInt();
												if (user_otp==gen_otp)
												{
													System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
													System.out.println("Payment done by using 'Phonepay' ");
												}	
												else
												{
													System.out.println("The order is failed[Wrong OTP Entered ]");
												}	
												break;
											}
											default:
											{
												System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
												break;}						
						
											}
									}
									else
									{
										System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
									}
									break;
								}
							default:
								{
									System.out.println("You entered the  Pongal is 'NOT IN MENU',pongal_type(1 or 2)");
								}
							
							}
							break;
						}
					case 2:
						{
							System.out.println("heyy!!-- you selected 'Mushroom fried rice'");
							double mr_price=200;
							System.out.println("The price of Mushroom fried rice is "+mr_price);
							System.out.print("Enter the Quantity :");
							int Qty=sc.nextInt();
							double sys_bill=mr_price*Qty;
							System.out.println("The total amount is " +sys_bill);
							System.out.print("Enter your total bill amount  :");
							double user_bill=sc.nextDouble();
							if (user_bill==sys_bill)
							{
								System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
								System.out.print("Enter your payment method  :");
								int pay_mth=sc.nextInt();
								switch (pay_mth)
								{
								case 1:
								{
									System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
									int gen_otp=(int)(Math.random()*9999+9999);
									System.out.println(gen_otp);
									System.out.print("Enter the otp  :");
									int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
									break;
							   }
								case 2:

								{
									System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
									int gen_otp=(int)(Math.random()*9999+9999);
									System.out.println(gen_otp);
									System.out.print("Enter the otp  :");
									int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
								}
								default:
								{
									System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
									break;}						
							
								}
							}
							else
							{
								System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
							}
								break;
							}
					case 3:
						{
							System.out.println("heyy!!-- you selected 'Dosai!!'");
							double mb_price=320;
					System.out.print("Enter the Quantity  :");
					int Qty=sc.nextInt();
					double sys_bill=mb_price*Qty;
					System.out.println("The total amount is " +sys_bill);
					System.out.print("Enter your total bill amount  :");
					double user_bill=sc.nextDouble();
					if (user_bill==sys_bill)
					{
						System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
						System.out.print("Enter your payment method  :");
						int pay_mth=sc.nextInt();
						switch (pay_mth)
						{
						case 1:
							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
						case 2:

							{
								System.out.println("\t\t\t You are in G-pay\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in A2B Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
						default:
							{
								System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
							break;
						}
					default:
						{
							System.out.println("\t\tEnter the valid food by A2B-Hotels)");
							break;
						}
					
					}
					break;
			}
		 case 3:
			{
				System.out.println("\t\t\t\tWelcome to Amma hotel");
				System.out.println("\t\tselect the menu");
				System.out.println("\t1.Idly\n\t2.Sambar Rice\n\t3.Rot1\n\t4.Curd Rice");
				System.out.print("Enter your food(1-4)  :");
				int sel_afood=sc.nextInt();
				switch (sel_afood)
				{
					case 1: 
					{
						
						System.out.println("The selected food is Idly ");
						double mb_price=1;
						System.out.println("The price of Idly is \t"+mb_price);
						System.out.print("Enter the Quantity  :");
						int Qty=sc.nextInt();
						double sys_bill=mb_price*Qty;
						System.out.println("The total amount is " +sys_bill);
						System.out.print("Enter your total bill amount  :");
						double user_bill=sc.nextDouble();
						if (user_bill==sys_bill)
						{
							System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
							System.out.print("Enter your payment method  :");
							int pay_mth=sc.nextInt();
							switch (pay_mth)
							{
						    	case 1:
								{
									System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
									int gen_otp=(int)(Math.random()*9999+9999);
									System.out.println(gen_otp);
									System.out.print("Enter the otp  :");
									int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amman Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
									break;
							    }
								case 2:
								{
									System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
									int gen_otp=(int)(Math.random()*9999+9999);
									System.out.println(gen_otp);
									System.out.print("Enter the otp  :");
									int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
									break;
								}
								default:
								{
									System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
									break;
								}	
							}
						}
						else
						{
							System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
						}
					
				
						break;
					}
					
					case 2: 
					{
						System.out.println("The selected food is Sambar Rice ");
						double mb_price=5;
						System.out.println("The price of Sambar Rice is \t"+mb_price);
						System.out.print("Enter the Quantity  :");
						int Qty=sc.nextInt();
						double sys_bill=mb_price*Qty;
						System.out.println("The total amount is " +sys_bill);
						System.out.print("Enter your total bill amount  :");
						double user_bill=sc.nextDouble();
						if (user_bill==sys_bill)
						{
							System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
							System.out.print("Enter your payment method  :");
							int pay_mth=sc.nextInt();
							switch (pay_mth)
							{
							case 1:
							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
							case 2:

							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
							default:
							{
								System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
						break;
					}
					case 3:
					{
						System.out.println("The selected food is Roti ");
						double mb_price=5;
						System.out.println("The price of Roti is \t"+mb_price);
						System.out.print("Enter the Quantity  :");
						int Qty=sc.nextInt();
						double sys_bill=mb_price*Qty;
						System.out.println("The total amount is " +sys_bill);
						System.out.print("Enter your total bill amount  :");
						double user_bill=sc.nextDouble();
						if (user_bill==sys_bill)
						{
							System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
							System.out.print("Enter your payment method  :");
							int pay_mth=sc.nextInt();
							switch (pay_mth)
							{
							case 1:
							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
							case 2:

							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
							default:
							{
								System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
					else
					{
						System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
					}
						break;
					}
					case 4:
					{
						System.out.println("The selected food is Curd Rice ");
						double mb_price=4;
						System.out.println("The price of Curd is \t"+mb_price);
						System.out.println("The curd rice is good for digestion");
						System.out.print("Enter the Quantity  :");
						int Qty=sc.nextInt();
						double sys_bill=mb_price*Qty;
						System.out.println("The total amount is " +sys_bill);
						System.out.print("Enter your total bill amount  :");
						double user_bill=sc.nextDouble();
						if (user_bill==sys_bill)
						{
							System.out.println("The available payment method is\n\t1.G-pay\n\t2.PhonePay");
							System.out.print("Enter your payment method  :");
							int pay_mth=sc.nextInt();
							switch (pay_mth)
							{
							case 1:
							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.println("Enter the otp:");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'G-pay' ");
									}
									else
									{
										System.out.println("The order is failed[wrong OTP Entered]");
									}
								break;
							   }
							case 2:

							{
								System.out.println("\t\t\t You are in G-pay\n\t\t\t proceed your payment");
								int gen_otp=(int)(Math.random()*9999+9999);
								System.out.println(gen_otp);
								System.out.print("Enter the otp  :");
								int user_otp=sc.nextInt();
									if (user_otp==gen_otp)
									{
										System.out.println("The order is successfull\n\tThankyou for ordering in Amma Hotels");
										System.out.println("Payment done by using 'Phonepay' ");
									}
									else
									{
										System.out.println("The order is failed[Wrong OTP Entered ]");
									}
								break;
							}
							default:
							{
								System.out.println("order cancled\n\tEnter the valid payment method(1,2)");
								break;}						
						
						}
					}
						else
						{
							System.out.println("Order failed\n\t[Wrong Bill Enterd] your total bill is " +sys_bill);
						}
							break;
					}
					default:
					{
						System.out.println("Invalid menu Selected(1-4)");
						break;
					}
				}
				break;
			}
		
		  default:
			{
				System.out.println("\t\t\t\t\tEnter the valid hotel number ranges(1-3)");
				break;
		    }
		}
	}
}
