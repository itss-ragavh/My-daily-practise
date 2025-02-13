# Aadhar Portal System

This is a simple Java-based Aadhar Portal system that allows users to:
- Retrieve Aadhar card details (Name, Aadhar Number, Contact, Address).
- Update details like Name, Contact, and Address (with verification).

## Features:
1. **View Aadhar Info**: Allows users to retrieve details of an Aadhar card by entering the Aadhar number.
2. **Update Aadhar Info**: Users can update the Name, Contact, or Address after verifying their identity using an OTP mechanism.
3. **OTP Verification**: A simple OTP generation system to verify the identity of the user before updating personal information.
4. **Multiple Aadhar Cards**: The portal supports multiple pre-existing Aadhar cards for demonstration purposes.
5. **Error Handling**: Handles cases where invalid Aadhar numbers are entered, or incorrect OTPs are provided.

## How It Works:
1. **View Info**:
   - The user enters an Aadhar number.
   - If the number matches an existing Aadhar card, the details (Name, Aadhar number, Contact, Address) are displayed.
   
2. **Update Info**:
   - The user enters the Aadhar number they want to update.
   - The system verifies the user by asking for the registered contact number.
   - If the contact matches, the user is asked to enter an OTP.
   - If the OTP is correct, the user can update their Name, Contact, or Address.

## Instructions to Run the Program:
1. Compile the program using a Java compiler.
   - Command: `javac AadharPortal.java`

2. Run the compiled program.
   - Command: `java AadharPortal`

3. The following options will be available on the home page:
   - **Option 1**: Retrieve Aadhar information by entering the Aadhar number.
   - **Option 2**: Update Aadhar information (Name, Contact, or Address).
   - **Option 3**: Exit the portal.

4. For updating information, you will be prompted to verify your identity using your registered contact number and OTP.

## Example Output:

                
                        Welcome to Aadhar Portal
        1. Get Info
        2. Set Info
        3. Exit

                Enter the choice (1-3) :1
                        Enter Aadhar Number to retrieve Info: 123456789

                        Aadhar Details:
                                Name: Tabrez
                                Aadhar Number: 123456789
                                Contact: 9876543210
                                Address: London
                        ----------------------------------



                        Welcome to Aadhar Portal
        1. Get Info
        2. Set Info
        3. Exit

                Enter the choice (1-3) :2
                        Enter Aadhar Number to update Info: 123456789
        What would you like to update?
                1. Name
                2. Contact
                3. Address
                4. Back
                        Enter your choice :1
                                Enter new Name: Harish
                                Enter Registered Contact Number: 9876543210
                                Enter OTP: 15521
                                Enter thr OTP :15521
                                Name Updated


                        Welcome to Aadhar Portal
        1. Get Info
        2. Set Info
        3. Exit

                Enter the choice (1-3) :1
                        Enter Aadhar Number to retrieve Info: 123456789

                        Aadhar Details:
                                Name: Harish
                                Aadhar Number: 123456789
                                Contact: 9876543210
                                Address: London
                        ----------------------------------



                        Welcome to Aadhar Portal
        1. Get Info
        2. Set Info
        3. Exit

                Enter the choice (1-3) :3
                        ---Thank You For Using Aadhar Portal---

## Important Notes:
1. **OTP System**: The OTP is generated randomly and must be entered correctly to proceed with any updates.
2. **Multiple Attempts**: The system allows the user to retry the process if the OTP verification or contact number verification fails.
3. **Updating Info**: You can update the Name, Contact, or Address for each Aadhar card after successfully verifying your identity.

## Contact Information:
If you have any feedback or questions, feel free to reach out to me!

- **Email**: [harishragavendra2305@gmail.com](mailto:harishragavendra2305@gmail.com)
- **LinkedIn**: [Harish Ragavendra](https://www.linkedin.com/in/harishragavendra23)

## Note:
- This is a basic prototype for educational purposes.
- In a real-world scenario, Aadhar verification and OTP systems would involve secure, encrypted communication with official databases and services.

Enjoy using the Aadhar Portal!
