## ecommerce-cli: A Command-Line Interface for Managing Your E-commerce Store

This repository contains the source code for `ecommerce-cli`, a powerful command-line interface (CLI) tool designed to simplify the management of your e-commerce store. Built using Java and Maven, this CLI offers a robust and efficient way to interact with your e-commerce platform.
It's part of Programming Assignment Unit 2 (week 2) in the UoPeople university.
**Features:**

* **Product Management:**
    * Add new products with detailed information (name, description, price, inventory, etc.).
* **Order Management:**
    * Create new orders for customers.
    * View details of existing orders (products, customer information, status).
* **Customer Management:**
    * Add new customers.
 
* **Reporting:**
    * Generate reports on sales, inventory, and customer activity.

**Getting Started:**

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Angeloabrita/ecommerce-cli.git
   ```

2. **Build the project:**

   ```bash
   cd ecommerce-cli
   mvn clean install
   ```

3. **Run the CLI:**

   ```bash
   mvn exec:java -Dexec.mainClass="com.example.ecommercecli.Main"
   ```

4. **Follow the on-screen prompts to interact with the CLI.**

**Configuration:**

The CLI can be configured to connect to your e-commerce platform's API. Refer to the `config.properties` file for details on setting up your API credentials and other configuration options.

**Contributing:**

Contributions to `ecommerce-cli` are welcome! Please submit pull requests for bug fixes, feature enhancements, and documentation improvements.

**License:**

This project is licensed under the MIT License.

**Support:**

For support and assistance, please open an issue on the GitHub repository.



